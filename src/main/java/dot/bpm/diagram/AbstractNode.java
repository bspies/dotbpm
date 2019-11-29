package dot.bpm.diagram;

/**
 * Base class for diagram graph nodes.
 */
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
