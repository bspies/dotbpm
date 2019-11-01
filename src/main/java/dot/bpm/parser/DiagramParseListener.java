package dot.bpm.parser;

import dot.bpm.diagram.DiagramElement;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.antlr.DOTBPMBaseListener;
import dot.bpm.parser.antlr.DOTBPMParser;

import java.util.ArrayDeque;

class DiagramParseListener extends DOTBPMBaseListener {

    private ProcessDiagram processDiagram;
    private ArrayDeque<DiagramElement> parseStack = new ArrayDeque<>();

    public ProcessDiagram getProcessDiagram() {
        return processDiagram;
    }

    @Override public void enterProcess(DOTBPMParser.ProcessContext ctx) {
        processDiagram = new ProcessDiagram();
    }

    @Override public void exitProcess(DOTBPMParser.ProcessContext ctx) {

    }
}
