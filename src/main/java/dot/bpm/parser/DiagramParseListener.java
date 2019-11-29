package dot.bpm.parser;

import dot.bpm.diagram.DiagramElement;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;

class DiagramParseListener extends DOTBPMBaseListener {

    private ProcessDiagram processDiagram;
    private DiagramElement lastElement;

    public ProcessDiagram getProcessDiagram() {
        return processDiagram;
    }

    @Override public void enterProcess(DOTBPMParser.ProcessContext ctx) {
        processDiagram = new ProcessDiagram();
    }

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {

    }

    @Override
    public void enterActivity(DOTBPMParser.ActivityContext ctx) {
        String activityType = ctx.activity_type().toString();
        System.out.println("Activity type: " + activityType);
    }
}
