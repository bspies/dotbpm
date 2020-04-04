package dot.bpm.diagram;

import java.util.Collection;
import java.util.Optional;

public class ProcessDiagram implements Diagram {

    private String name, description;
    private final DiagramDelegate delegate = new DiagramDelegate();

    public ProcessDiagram() {}

    public ProcessDiagram(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    @Override
    public Collection<Node> getNodes() {
        return delegate.getNodes();
    }

    @Override
    public boolean addNode(Node node) {
        return delegate.addNode(node);
    }

    @Override
    public Optional<Node> findNode(String id) {
        return delegate.findNode(id);
    }

    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return delegate.getSequenceFlows();
    }

    @Override
    public boolean addFlow(SequenceFlow flow) {
        return delegate.addFlow(flow);
    }

    @Override
    public boolean addFlow(Node source, Node target) {
        return delegate.addFlow(source, target);
    }
}
