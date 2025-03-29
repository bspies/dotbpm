package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GatewayTests extends DotBpmTests {
    @Test
    public void parseForkingProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("fork_gateway.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 7 nodes")
                .hasSize(7);
    }

    @Test
    public void parseForkJoinProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("forkjoin_gateway.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 7 nodes")
                .hasSize(7);
    }
}
