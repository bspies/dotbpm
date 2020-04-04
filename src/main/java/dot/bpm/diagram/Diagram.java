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

import java.util.Collection;
import java.util.Optional;

/**
 * Represents a diagram, a container of workflow
 * elements.
 */
public interface Diagram {
    /**
     * Returns all nodes in the graph.
     * @return The nodes
     */
    Collection<Node> getNodes();

    /**
     * Returns all the sequence flows in the graph.
     * @return The sequence flows
     */
    Collection<SequenceFlow> getSequenceFlows();

    /**
     * Adds a node to the diagram.
     * @param node The node to add
     * @return True if node added, false if already present
     */
    boolean addNode(Node node);

    /**
     * Finds the node with the given id, if it is present
     * in the diagram.
     * @param id The id of the node
     * @return The node (if present)
     */
    Optional<Node> findNode(String id);

    /**
     * Adds a flow to the diagram.
     * @param flow The flow to add
     * @return True if sequence flow added, false if already present
     */
    boolean addFlow(SequenceFlow flow);

    /**
     * Adds a flow between two nodes.
     * @param source The source node
     * @param target The target node
     * @return True if sequence flow added, false if already present
     */
    boolean addFlow(Node source, Node target);
}
