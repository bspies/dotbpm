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
package dot.bpm.core;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A collection of attributes.
 *
 * @author Brennan Spies
 */
public class Attributes {

    private final Map<QualifiedName, Attribute<?>> attributeMap;

    public Attributes(Attribute<?>...attributes) {
        this(Arrays.asList(attributes));
    }

    public Attributes(Collection<Attribute<?>> attributes) {
        attributeMap = attributes.stream()
                .collect(Collectors.toMap(Attribute::getQualifiedName, Function.identity()));
    }

    public Collection<Attribute<?>> getAttributes() {
        return attributeMap.values();
    }

    public Optional<Object> getValue(QualifiedName name) {
        Attribute<?> attribute = attributeMap.get(name);
        return attribute == null ? Optional.empty() : Optional.of(attribute.getValue());
    }

    public <T> Optional<T> getValue(Class<T> type, QualifiedName name) {
        Attribute<?> attribute = attributeMap.get(name);
        if (attribute == null) {
            return Optional.empty();
        }
        Object value = attribute.getValue();
        validateType(type, value.getClass());
        return Optional.of(type.cast(value));
    }

    private void validateType(Class<?> expectedType, Class<?> actualType) {
        if (!actualType.isAssignableFrom(expectedType)) {
            throw new IllegalArgumentException(
                    String.format("Actual type '%s' does not match expected type '%s'",
                            actualType.getCanonicalName(),
                            expectedType.getCanonicalName()
                    )
            );
        }
    }
}
