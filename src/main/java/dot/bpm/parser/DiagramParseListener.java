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
package dot.bpm.parser;

import dot.bpm.diagram.*;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Constructs the process from the parsed dotBPM.
 */
class DiagramParseListener extends DOTBPMBaseListener {

    private static Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static Pattern booleanPattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
    private enum TaskType { USER, SCRIPT, SERVICE }

    private ProcessDiagram processDiagram;
    private final Deque<Node> nodeQueue;
    private final Deque<SequenceFlow.Builder> flowQueue;

    public DiagramParseListener() {
        nodeQueue = new ArrayDeque<>();
        flowQueue = new ArrayDeque<>();
    }

    public ProcessDiagram getProcessDiagram() {
        return processDiagram;
    }

    @Override public void enterProcess(DOTBPMParser.ProcessContext ctx) {
        processDiagram = new ProcessDiagram();
    }

    @Override
    public void enterPool(DOTBPMParser.PoolContext ctx) {
        System.out.println("Entering pool " + ctx.getText());
    }

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {
        String name = ctx.id().getText();
        processDiagram.setName(name);
    }

    @Override
    public void exitTask(DOTBPMParser.TaskContext ctx) {
        String activityId = ctx.id().getText();
        String activityType = ctx.task_type().getText();
        ActivityNode activityNode = createActivityNode(activityId, activityType);
        processNode(activityNode);
    }

    @Override
    public void exitEvent(DOTBPMParser.EventContext ctx) {
        String eventId = ctx.id().getText();
        String symbol = ctx.event_type().getText();
        EventNode eventNode = createEventNode(eventId, symbol);
        processNode(eventNode);
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

    private void processNode(Node node) {
        processDiagram.addNode(node);
        if (flowQueue.peek() != null) {
            processDiagram.addFlow(flowQueue.pop().withTarget(node).build());
        }
        nodeQueue.push(node);
    }

/*    private ActivityNode getActivityNode(String id, String type) {
        Optional<Node> maybeNode = processDiagram.findNode(id);
        return maybeNode.map(node -> (ActivityNode) node).orElseGet(() -> createActivityNode(id, type));
    }*/

    private ActivityNode createActivityNode(String id, String type) {
        TaskType taskType = TaskType.valueOf(type.toUpperCase());
        switch (taskType) {
            case USER:
                return new UserTaskNode(processDiagram, null /* TODO: determine lane */, id);
            case SCRIPT:
                return new ScriptNode(processDiagram, null /* TODO: determine lane */, id);
            default:
                throw new IllegalArgumentException("Unknown activity type: " + type);
        }
    }

    private EventNode createEventNode(String id, String symbol) {
        return new EventNode(processDiagram, null /* TODO: determine lane */, new EventSpec(null /* TODO: category */, EventType.of(symbol)), id);
    }
}
