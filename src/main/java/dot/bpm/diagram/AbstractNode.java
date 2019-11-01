package dot.bpm.diagram;

public abstract class AbstractNode implements Node {

    private Diagram parent;
    private Lane lane;

    @Override public Diagram getParent() {
        return parent;
    }

    @Override public Lane getLane() {
        return lane;
    }
}
