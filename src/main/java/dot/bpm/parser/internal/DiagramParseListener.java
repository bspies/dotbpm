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
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.diagram.SequenceFlow;
import dot.bpm.diagram.activities.ActivityNodeDelegate;
import dot.bpm.diagram.activities.BaseActivityNode;
import dot.bpm.diagram.activities.ScriptNode;
import dot.bpm.diagram.activities.TaskNode;
import dot.bpm.diagram.builder.ProcessDiagramBuilder;
import dot.bpm.diagram.events.EventCategory;
import dot.bpm.diagram.events.EventDefinition;
import dot.bpm.diagram.events.EventNode;
import dot.bpm.diagram.events.EventType;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Constructs the process from the parsed dotBPM.
 */
public class DiagramParseListener extends DOTBPMBaseListener {

    private static Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static Pattern booleanPattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
    private enum TaskType { USER, SCRIPT, SERVICE }

    private ProcessDiagramBuilder processDiagramBuilder;
    private final Deque<FlowNode> nodeQueue;
    private final Deque<SequenceFlow.Builder> flowQueue;

    public DiagramParseListener() {
        nodeQueue = new ArrayDeque<>();
        flowQueue = new ArrayDeque<>();
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

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {
        String name = ctx.id().getText();
        processDiagramBuilder.withName(name);
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

    }

    /*    @Override
    public void exitGateway(DOTBPMParser.GatewayContext ctx) {
        String gatewayId = ctx.id().getText();
        String symbol = ctx.gateway_type().getText();
    }*/

    @Override
    public void exitSequence_flow(DOTBPMParser.Sequence_flowContext ctx) {
        if (nodeQueue.peek() == null) {
            throw new IllegalStateException("Sequence flow must be proceeded by a node");
        }
        flowQueue.push(SequenceFlow.builder().withSource(nodeQueue.pop()));
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

    private Map<String,Object> getActivityAttributes(DOTBPMParser.TaskContext taskContext) {
        Map<String,Object> attrs = new HashMap<>();
        DOTBPMParser.Attr_listContext attrList = taskContext.attr_list();
        for (int i = 0; i < attrList.getChildCount(); i++) {
            DOTBPMParser.AttributeContext attrContext = attrList.attribute(i);
            String attrName = attrContext.id().getText();
            Object attrValue = parseValue(attrContext.attr_value().getText());
            attrs.put(attrName, attrValue);
        }
        return attrs;
    }

    ////////////////////////////// internal helper methods /////////////////////////////////

    private Object parseValue(String strValue) {
        if (numberPattern.matcher(strValue).matches()) {
            return Double.parseDouble(strValue);
        } else if (booleanPattern.matcher(strValue).matches()) {
            return Boolean.parseBoolean(strValue);
        }
        // time/date values, etc.
        return strValue;
    }

    private void processNode(FlowNode node) {
        processDiagramBuilder.withNode(node);
        if (flowQueue.peek() != null) {
            processDiagramBuilder.withSequenceFlow(flowQueue.pop().withTarget(node).build());
        }
        nodeQueue.push(node);
    }

/*    private ActivityNode getActivityNode(String id, String type) {
        Optional<FlowNode> maybeNode = processDiagram.findNode(id);
        return maybeNode.map(node -> (ActivityNode) node).orElseGet(() -> createActivityNode(id, type));
    }*/

    private BaseActivityNode createActivityNode(String id, String type) {
        TaskType taskType = TaskType.valueOf(type.toUpperCase());
        ActivityNodeDelegate activityNodeDelegate = new ActivityNodeDelegate(id, null /* lane */);
        switch (taskType) {
            case USER:
                return new TaskNode(activityNodeDelegate);
            case SCRIPT:
                return new ScriptNode(activityNodeDelegate, null /* script */);
            default:
                throw new IllegalArgumentException("Unknown activity type: " + type);
        }
    }

    private EventNode createEventNode(String id, EventCategory category, EventType type) {
        return new EventNode(id, null,  new EventDefinition(category, type));
    }
}
