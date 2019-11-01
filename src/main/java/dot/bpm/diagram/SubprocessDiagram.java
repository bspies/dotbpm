package dot.bpm.diagram;

import java.util.Collection;

public class SubprocessDiagram implements Diagram, Node {

    @Override public Collection<Node> getNodes() {
        return null;
    }

    @Override public void addNode(Node node) {

    }

    @Override public void addFlow(SequenceFlow flow) {

    }

    @Override public void addFlow(Node source, Node target) {

    }

    @Override public Diagram getParent() {
        return null;
    }

    @Override public Lane getLane() {
        return null;
    }
}
