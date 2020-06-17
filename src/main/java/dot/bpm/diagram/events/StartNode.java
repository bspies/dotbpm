package dot.bpm.diagram.events;

import dot.bpm.diagram.Lane;

/**
 * A node for a start event.
 */
public class StartNode extends CatchingNode {

    public StartNode(String id, Lane lane, EventDefinition eventDef) {
        super(id, lane, eventDef);
    }
}
