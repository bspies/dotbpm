/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dot.bpm.parser.internal;

import dot.bpm.diagram.FlowNode;
import dot.bpm.diagram.Lane;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.diagram.activities.ActivityNodeDelegate;
import dot.bpm.diagram.activities.BaseActivityNode;
import dot.bpm.diagram.activities.ScriptNode;
import dot.bpm.diagram.activities.TaskNode;
import dot.bpm.diagram.builder.PoolBuilder;
import dot.bpm.diagram.builder.ProcessDiagramBuilder;
import dot.bpm.diagram.builder.SequenceFlowBuilder;
import dot.bpm.diagram.events.EventCategory;
import dot.bpm.diagram.events.EventDefinition;
import dot.bpm.diagram.events.EventNode;
import dot.bpm.diagram.events.EventType;
import dot.bpm.diagram.gateways.ForkNode;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

/**
 * Constructs the process from the parsed dotBPM.
 */
public class DiagramParseListener extends DOTBPMBaseListener {

    private enum TaskType { USER, SCRIPT, SERVICE }

    private ProcessDiagramBuilder processDiagramBuilder;
    private final Deque<FlowNode> nodeQueue;
    private final Deque<SequenceFlowBuilder> inProgressSequenceFlows;
    private final List<DeferredSequenceFlowBuilder> deferredSequenceFlows;

    public DiagramParseListener() {
        nodeQueue = new ArrayDeque<>();
        inProgressSequenceFlows = new ArrayDeque<>();
        deferredSequenceFlows = new ArrayList<>();
    }

    public ProcessDiagram getProcessDiagram() {
        return processDiagramBuilder.build();
    }

    @Override public void enterProcess(DOTBPMParser.ProcessContext ctx) {
        processDiagramBuilder = new ProcessDiagramBuilder();
    }

    @Override
    public void enterPool(DOTBPMParser.PoolContext ctx) {
        System.out.println("Entering pool " + ctx.getText());
    }

    @Override
    public void exitPool_header(DOTBPMParser.Pool_headerContext ctx) {
        String id = ctx.id().getText();
        processDiagramBuilder.withPool(new PoolBuilder(id));
    }

    @Override
    public void exitLane_header(DOTBPMParser.Lane_headerContext ctx) {
        PoolBuilder poolBuilder = processDiagramBuilder.getLastPool().orElseThrow();
        String id = ctx.id().getText();
        poolBuilder.withLane(new Lane(id, null /*todo name */));
    }

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {
        String name = ctx.id().getText();
        processDiagramBuilder.withName(name);
        resolveLinks();
    }

    @Override
    public void exitTask(DOTBPMParser.TaskContext ctx) {
        String activityId = ctx.id().getText();
        String activityType = ctx.task_type().getText();
        BaseActivityNode activityNode = createActivityNode(activityId, activityType);
        processNode(activityNode);
    }

    @Override
    public void exitEvent(DOTBPMParser.EventContext ctx) {
        String eventId = ctx.id().getText();
        DOTBPMParser.Event_categoryContext eventCategoryCtx = ctx.event_category();
        DOTBPMParser.Event_typeContext eventTypeCtx = ctx.event_type();
        EventCategory category = null;
        EventType type = null;
        if (eventCategoryCtx != null) {
            category = EventCategory.of(eventCategoryCtx.getText());
        }
        if (eventTypeCtx != null) {
            type = EventType.of(eventTypeCtx.getText());
        }
        EventNode eventNode = createEventNode(eventId, category, type);
        processNode(eventNode);
    }

    @Override
    public void exitFork_diverge(DOTBPMParser.Fork_divergeContext ctx) {
        String gatewayId = ctx.id().getText();
        ForkNode forkNode = createForkNode(gatewayId);
        ctx.outflows().link_list().link().forEach(linkCtx -> {
            SequenceFlowBuilder builder = new SequenceFlowBuilder().withSource(forkNode);
            final String targetId = getLinkId(linkCtx);
            Optional<FlowNode> maybeNode = processDiagramBuilder.findNode(targetId);
            maybeNode.ifPresentOrElse(builder::withTarget, () -> {
                deferredSequenceFlows.add(DeferredSequenceFlowBuilder.forTarget(targetId, builder));
            });
        });
    }

    @Override
    public void exitSequence_flow(DOTBPMParser.Sequence_flowContext ctx) {
        if (nodeQueue.peek() == null) {
            throw new IllegalStateException("Sequence flow must be proceeded by a node");
        }
        inProgressSequenceFlows.push(new SequenceFlowBuilder().withSource(nodeQueue.pop()));
    }

    @Override
    public void exitSequence_elem(DOTBPMParser.Sequence_elemContext ctx) {
        super.exitSequence_elem(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
        System.out.println("Exit rule: " + ctx.getText());
    }

    ////////////////////////////// internal helper methods /////////////////////////////////

    private String getLinkId(DOTBPMParser.LinkContext linkContext) {
        String linkId = null;
        if (linkContext.activity_link() != null) {
            linkId = linkContext.activity_link().id().getText();
        } else if (linkContext.event_link() != null) {
            linkId = linkContext.event_link().id().getText();
        } else if (linkContext.gateway_link() != null) {
            linkId = linkContext.gateway_link().id().getText();
        }
        if (linkId == null) {
            throw new RuntimeException("Unable to get link id from context");
        }
        return linkId;
    }

    private void processNode(FlowNode node) {
        processDiagramBuilder.withNode(node);
        if (inProgressSequenceFlows.peek() != null) {
            processDiagramBuilder.withSequenceFlow(inProgressSequenceFlows.pop().withTarget(node).build());
        }
        nodeQueue.push(node);
    }

    private void resolveLinks() {
        ListIterator<DeferredSequenceFlowBuilder> iterator = deferredSequenceFlows.listIterator();
        while(iterator.hasNext()) {
            DeferredSequenceFlowBuilder deferredSequenceFlowBuilder = iterator.next();
            if (deferredSequenceFlowBuilder.resolve(processDiagramBuilder)) {
                processDiagramBuilder.withSequenceFlow(deferredSequenceFlowBuilder.build());
                iterator.remove();
            }
        }
    }

    private BaseActivityNode createActivityNode(String id, String type) {
        TaskType taskType = TaskType.valueOf(type.toUpperCase());
        ActivityNodeDelegate activityNodeDelegate = new ActivityNodeDelegate(id, null /* todo lane */);
        switch (taskType) {
            case USER:
                return new TaskNode(activityNodeDelegate);
            case SCRIPT:
                return new ScriptNode(activityNodeDelegate, null /* todo script */);
            default:
                throw new IllegalArgumentException("Unknown activity type: " + type);
        }
    }

    private ForkNode createForkNode(String id) {
        return new ForkNode(id, null /* todo lane */);
    }

    private EventNode createEventNode(String id, EventCategory category, EventType type) {
        return new EventNode(id, null,  new EventDefinition(category, type));
    }
}
