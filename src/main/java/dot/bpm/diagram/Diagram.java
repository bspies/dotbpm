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
package dot.bpm.diagram;

import dot.bpm.diagram.data.DataFlow;

import java.util.Collection;
import java.util.Optional;

/**
 * Represents a diagram, a container of workflow
 * elements.
 *
 * @author Brennan Spies
 */
public interface Diagram {
    /**
     * Returns all nodes in the graph.
     * @return The nodes
     */
    Collection<FlowNode> getNodes();

    /**
     * Returns all the data flows in the diagram.
     * @return The data flows
     */
    Collection<DataFlow> getDataFlows();

    /**
     * Returns all the sequence flows in the diagram.
     * @return The sequence flows
     */
    Collection<SequenceFlow> getSequenceFlows();

    /**
     * Finds the node with the given id, if it is present
     * in the diagram.
     * @param id The id of the node
     * @return The node (if present)
     */
    Optional<FlowNode> findNode(String id);
}
