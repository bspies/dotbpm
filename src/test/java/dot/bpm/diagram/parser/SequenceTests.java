package dot.bpm.diagram.parser;

import dot.bpm.diagram.ProcessDiagram;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class SequenceTests extends DotBpmTests {
    @Test
    public void parseSequence() throws IOException {
        ProcessDiagram diagram = parseDiagram("sequence_2activities.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 4 nodes")
                .hasSize(4);
        assertThat(diagram.getSequenceFlows())
                .as("Diagram should have 3 sequence flows")
                .hasSize(3);
    }

    @Test
    public void parseSequenceWithThreeActivities() throws IOException {
        ProcessDiagram diagram = parseDiagram("sequence_3activities.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 5 nodes")
                .hasSize(5);
        assertThat(diagram.getSequenceFlows())
                .as("Diagram should have 4 sequence flows")
                .hasSize(4);
    }

    @Test
    public void parseMultipleSequences() throws Exception {
        ProcessDiagram diagram = parseDiagram("multiple_sequences.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 6 nodes")
                .hasSize(6);
    }
}
