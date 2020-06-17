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

import dot.bpm.diagram.FlowNode;
import dot.bpm.diagram.ProcessDiagram;
import dot.bpm.diagram.activities.TaskNode;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

public class BasicTests extends DotBpmTests {

    @Test
    public void parseSingleTask() throws IOException {
        ProcessDiagram diagram = parseDiagram("single_task.dotbpm");
        assertThat(diagram.getNodes())
                .as("Diagram should have single node")
                .hasSize(1);
        FlowNode node = diagram.getNodes().stream().findFirst().get();
        assertThat(node)
                .as("FlowNode should be a task node")
                .isInstanceOf(TaskNode.class);
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
}
