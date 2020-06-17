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

import dot.bpm.diagram.BaseFlowNode;
import dot.bpm.diagram.Lane;
import dot.bpm.diagram.messages.Messageable;

/**
 * FlowNode for events.
 */
public class EventNode extends BaseFlowNode implements Messageable {

    private final EventDefinition eventDefinition;

    public EventNode(String id, Lane lane, EventDefinition eventDef) {
        super(id, lane);
        this.eventDefinition = eventDef;
    }

    public EventDefinition getEventDefinition() {
        return eventDefinition;
    }
}
