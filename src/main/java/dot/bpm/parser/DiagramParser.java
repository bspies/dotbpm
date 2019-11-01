package dot.bpm.parser;

import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.parser.antlr.DOTBPMLexer;
import dot.bpm.parser.antlr.DOTBPMParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

/**
 * A parser for DotBPM diagrams.
 */
public class DiagramParser {
    public static ProcessDiagram parse(InputStream inputStream) throws IOException {
        DOTBPMLexer lexer;
        DOTBPMParser parser;
        lexer = new DOTBPMLexer(CharStreams.fromStream(inputStream));
        parser = new DOTBPMParser(new CommonTokenStream(lexer));
        DiagramParseListener listener = new DiagramParseListener();
        parser.addParseListener(listener);
        // error handlers
        ParseTree tree = parser.process();
        return listener.getProcessDiagram();
    }
}
