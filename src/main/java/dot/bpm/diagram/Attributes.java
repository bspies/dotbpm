package dot.bpm.diagram;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Attributes {

    private final Map<String, Attribute<?>> attributeMap;

    public Attributes(Collection<Attribute<?>> attributes) {
        attributeMap = attributes.stream()
                .collect(Collectors.toMap(Attribute::getName, Function.identity()));
    }

    @SuppressWarnings("unchecked")
    public Attributes(Map<String, Object> keyValues) {
        attributeMap = keyValues.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> new Attribute(entry.getValue().getClass(), entry.getKey(), entry.getValue())));
    }

    public Collection<Attribute<?>> getAttributes() {
        return attributeMap.values();
    }

    public Optional<Object> getValue(String name) {
        Attribute<?> attribute = attributeMap.get(name);
        return attribute == null ? Optional.empty() : Optional.of(attribute.getValue());
    }

    public <T> Optional<T> getValue(Class<T> type, String name) {
        Attribute<?> attribute = attributeMap.get(name);
        if (attribute == null) {
            return Optional.empty();
        }
        Object value = attribute.getValue();
        validateType(type, value.getClass());
        return Optional.of(type.cast(value));
    }

    private void validateType(Class<?> expectedType, Class<?> actualType) {

    }
}
