package dot.bpm.diagram.events;

import dot.bpm.diagram.Lane;

public class ThrowingNode extends EventNode {
    public ThrowingNode(String id, Lane lane, EventDefinition eventDef) {
        super(id, lane, eventDef);
    }
}
