package dot.bpm.diagram;

public interface Node extends DiagramElement {
    /**
     * Returns the swimlane to which this node belongs.
     * @return The swimlane
     */
    Lane getLane();
}
