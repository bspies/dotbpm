package dot.bpm.diagram;

public interface DiagramElement {
    /**
     * Returns the parent of this element.
     * @return The parent process or subprocess diagram
     */
    Diagram getParent();
}
