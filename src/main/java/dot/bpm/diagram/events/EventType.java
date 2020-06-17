/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dot.bpm.diagram.events;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * An enumeration of process event types.
 */
public enum EventType {
    COMPENSATION("<<"),
    CONDITIONAL("?"),
    CANCEL("X"),
    END("/"),
    ERROR("~"),
    ESCALATION("^"),
    MESSAGE("@"),
    MULTIPLE("*"),
    MULTIPLE_PARALLEL("+"),
    NONE("_"),
    SIGNAL("!"),
    START(">"),
    TERMINATE("-"),
    TIMER("..");

    private static final Map<String,EventType> lookup = createLookup();
    private final String symbol;

    EventType(String symbol) {
        this.symbol = symbol;
    }

    public static EventType of(String symbol) {
        EventType eventType = lookup.get(symbol);
        if (eventType == null) {
            throw new IllegalArgumentException("Symbol '" + symbol + "' is not a valid event type");
        }
        return eventType;
    }

    private String getSymbol() {
        return symbol;
    }

    private static Map<String,EventType> createLookup() {
        return Arrays.stream(EventType.values())
                .collect(Collectors.toMap(EventType::getSymbol, Function.identity()));
    }
}
