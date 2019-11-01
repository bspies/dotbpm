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
