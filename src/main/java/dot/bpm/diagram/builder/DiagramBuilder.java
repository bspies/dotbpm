package dot.bpm.diagram.builder;

import dot.bpm.diagram.Diagram;
import dot.bpm.diagram.FlowNode;

import java.util.Optional;

public interface DiagramBuilder<D extends Diagram> extends Builder<D> {
    Optional<FlowNode> findNode(String id);
}
