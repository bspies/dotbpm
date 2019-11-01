package dot.bpm.diagram;

public class MessageFlow implements DiagramElement {

    private Node source, target;

    public MessageFlow() {}

    public MessageFlow(Node source, Node target) {
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
