package dot.bpm.diagram;

public class GatewayEventNode extends GatewayNode {

    private final EventSpec eventSpec;

    public GatewayEventNode(Diagram parent, Lane lane, EventSpec eventSpec, String id) {
        super(parent, lane, GatewayType.EVENT, id);
        this.eventSpec = eventSpec;
    }

    public EventSpec getEventSpec() {
        return eventSpec;
    }
}
