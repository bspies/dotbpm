package dot.bpm.diagram;

public class SequenceFlow implements DiagramElement {

    private Node source, target;

    public SequenceFlow() {}

    public SequenceFlow(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    public Node getSource() {
        return source;
    }

    public Node getTarget() {
        return target;
    }

    @Override public Diagram getParent() {
        return source.getParent();
    }
}
