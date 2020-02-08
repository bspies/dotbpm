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

import dot.bpm.diagram.ActivityNode;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.diagram.ScriptNode;
import dot.bpm.diagram.TaskNode;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class DiagramParseListener extends DOTBPMBaseListener {

    private static Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    private static Pattern booleanPattern = Pattern.compile("true|false", Pattern.CASE_INSENSITIVE);
    private ProcessDiagram processDiagram;

    public ProcessDiagram getProcessDiagram() {
        return processDiagram;
    }

    @Override public void enterProcess(DOTBPMParser.ProcessContext ctx) {
        processDiagram = new ProcessDiagram();
    }

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {
        String name = ctx.id().getText();
        processDiagram.setName(name);
    }

    @Override
    public void exitActivity(DOTBPMParser.ActivityContext ctx) {
        String activityId = ctx.id().getText();
        String activityType = ctx.activity_type().getText();
        ActivityNode activityNode = createActivityNode(activityType);
        processDiagram.addNode(activityNode);
    }

    @Override
    public void exitSeq_flow(DOTBPMParser.Seq_flowContext ctx) {
        super.exitSeq_flow(ctx);
    }

    private Map<String,Object> getActivityAttributes(DOTBPMParser.ActivityContext activityContext) {
        Map<String,Object> attrs = new HashMap<>();
        DOTBPMParser.Attr_listContext attrList = activityContext.attr_list();
        for (int i = 0; i < attrList.getChildCount(); i++) {
            String attrName = attrList.id(i).getText();
            Object attrValue = parseValue(attrList.attr_value(i).STRING().getText());
            attrs.put(attrName, attrValue);
        }
        return attrs;
    }

    private Object parseValue(String strValue) {
        if (numberPattern.matcher(strValue).matches()) {
            return Double.parseDouble(strValue);
        } else if (booleanPattern.matcher(strValue).matches()) {
            return Boolean.parseBoolean(strValue);
        }
        // time/date values, etc.
        return strValue;
    }

    private ActivityNode createActivityNode(String type) {
        switch (type) {
            case "task":
                return new TaskNode(processDiagram, null /* TODO: determine lane */);
            case "script":
                return new ScriptNode(processDiagram, null /* TODO: determine lane */);
            default:
                throw new IllegalArgumentException("Unknown activity type: " + type);
        }
    }
}
