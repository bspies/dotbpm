package dot.bpm.diagram;

import java.util.Collection;

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
    public void addNode(Node node) {
        delegate.addNode(node);
    }

    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return delegate.getSequenceFlows();
    }

    @Override
    public void addFlow(SequenceFlow flow) {
        delegate.addFlow(flow);
    }

    @Override
    public void addFlow(Node source, Node target) {
        delegate.addFlow(source, target);
    }
}
