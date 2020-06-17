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
package dot.bpm.diagram.messages;

import dot.bpm.diagram.events.EventCategory;
import dot.bpm.diagram.events.EventDefinition;
import dot.bpm.diagram.events.EventType;

public class MessageDefinition extends EventDefinition {

    private String correlationId;

    public MessageDefinition(EventCategory category) {
        super(category, EventType.MESSAGE);
    }

    public MessageDefinition(EventCategory category, String correlationId) {
        this(category);
        this.correlationId = correlationId;
    }

    public String getCorrelationId() {
        return correlationId;
    }
}
