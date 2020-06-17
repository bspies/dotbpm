package dot.bpm.diagram.events;

public class EventDefinition {

    private final EventType eventType;

    public EventDefinition(EventCategory category, EventType eventType) {
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return eventType;
    }
}
