package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import org.junit.Test;

public class GatewayTests extends DotBpmTests {
    @Test
    public void parseForkingProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("fork_gateway.dotbpm");
    }

    @Test
    public void parseForkJoinProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("forkjoin_gateway.dotbpm");
    }
}
