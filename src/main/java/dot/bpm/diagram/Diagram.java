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
     */
    void addNode(Node node);

    /**
     * Adds a flow to the diagram.
     * @param flow The flow to add
     */
    void addFlow(SequenceFlow flow);

    /**
     * Adds a flow between two nodes.
     * @param source The source node
     * @param target The target node
     */
    void addFlow(Node source, Node target);
}
