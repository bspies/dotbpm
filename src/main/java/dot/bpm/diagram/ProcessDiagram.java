package dot.bpm.diagram;

import java.util.Collection;

public class ProcessDiagram implements Diagram {

    private String name, description;

    public ProcessDiagram() {}

    public ProcessDiagram(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Collection<Node> getNodes() {
        return null;
    }

    @Override
    public void addNode(Node node) {

    }

    @Override
    public void addFlow(SequenceFlow flow) {

    }

    @Override
    public void addFlow(Node source, Node target) {

    }
}
