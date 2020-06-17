package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import org.junit.Test;

import java.io.IOException;

public class MessageTests extends DotBpmTests {

    @Test
    public void parseIntraProcessMessage() throws IOException {
        ProcessDiagram diagram = parseDiagram("intra_message.dotbpm");
    }
}
