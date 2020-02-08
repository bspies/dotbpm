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
import dot.bpm.diagram.TaskNode;
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
    public void parseSingleActivity() throws IOException {
        ProcessDiagram diagram = parseDiagram("single_task.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have single node")
                .hasSize(1);
        Node node = diagram.getNodes().stream().findFirst().get();
        assertThat(node)
                .as("Node should be a task node")
                .isInstanceOf(TaskNode.class);
    }

    @Test
    public void parseTwoActivitiesWithSequence() throws IOException {
        ProcessDiagram diagram = parseDiagram("sequence_2.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have two nodes")
                .hasSize(2);
        assertThat(diagram.getSequenceFlows())
                .as("Diagram should have one sequence flow")
                .hasSize(1);
    }

    @Test
    public void parseThreeActivitiesWithSequence() throws IOException {
        ProcessDiagram diagram = parseDiagram("sequence_3.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have three nodes")
                .hasSize(3);
        assertThat(diagram.getSequenceFlows())
                .as("Diagram should have two sequence flows")
                .hasSize(2);
    }
}
