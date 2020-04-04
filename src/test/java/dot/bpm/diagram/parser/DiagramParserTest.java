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
package dot.bpm.diagram.parser;

import dot.bpm.diagram.Node;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.diagram.UserTaskNode;
import dot.bpm.parser.DiagramParser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

public class DiagramParserTest {

    /**
     * Parses the given dotbpm file into a process diagram.
     * @param fileName The name of the file
     * @return The process diagram
     * @throws IOException If an error occurs opening the file
     */
    private ProcessDiagram parseDiagram(String fileName) throws IOException {
        String fullFilePath = this.getClass().getPackage().getName().replace('.', '/') +
                "/" +
                fileName;
        try (InputStream is = this.getClass().getClassLoader().getResourceAsStream(fullFilePath)) {
            assertNotNull("File not found: " + fileName, is);
            return DiagramParser.parse(is);
        }
    }

    @Test
    public void parseSingleTask() throws IOException {
        ProcessDiagram diagram = parseDiagram("single_task.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have single node")
                .hasSize(1);
        Node node = diagram.getNodes().stream().findFirst().get();
        assertThat(node)
                .as("Node should be a task node")
                .isInstanceOf(UserTaskNode.class);
    }

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

    @Test
    public void parsePoolWithLanes() throws Exception {
        ProcessDiagram diagram = parseDiagram("pool_2lanes.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 6 nodes")
                .hasSize(6);
    }

    @Test
    public void parseSinglePool() throws Exception {
        ProcessDiagram diagram = parseDiagram("single_pool.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have 4 nodes")
                .hasSize(4);
    }

    @Test
    public void parseForkingProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("fork_gateway.dotbpm");
    }

    @Test
    public void parseForkJoinProcess() throws Exception {
        ProcessDiagram diagram = parseDiagram("forkjoin_gateway.dotbpm");
    }
}
