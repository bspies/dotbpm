package dot.bpm.diagram.events;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum EventCategory {
    START (">"),
    INTERMEDIATE(""),
    END("/");

    private static final Map<String,EventCategory> lookup = createLookup();
    private final String symbol;

    EventCategory(String symbol) {
        this.symbol = symbol;
    }

    private String getSymbol() {
        return symbol;
    }

    public static EventCategory of(String symbol) {
        EventCategory category = lookup.get(symbol);
        if (category == null) {
            throw new IllegalArgumentException("Symbol '" + symbol + "' is not a valid event type");
        }
        return category;
    }

    private static Map<String,EventCategory> createLookup() {
        return Arrays.stream(EventCategory.values())
                .collect(Collectors.toMap(EventCategory::getSymbol, Function.identity()));
    }
}
