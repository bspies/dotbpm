package dot.bpm.diagram.events;

import dot.bpm.diagram.Lane;

public class CatchingNode extends EventNode {

    public CatchingNode(String id, Lane lane, EventDefinition eventDef) {
        super(id, lane, eventDef);
    }
}
