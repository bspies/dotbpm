package dot.bpm.diagram.events;

import dot.bpm.diagram.Lane;

/**
 * A terminal event node.
 */
public class EndNode extends ThrowingNode {

    public EndNode(String id, Lane lane, EventDefinition eventDef) {
        super(id, lane, eventDef);
    }
}
