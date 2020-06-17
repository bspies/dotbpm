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

import dot.bpm.diagram.activities.BaseActivityNode;

/**
 * An event that is attached to an activity.
 *
 * @author Brennan Spies
 */
public class BoundaryEvent extends CatchingNode {

    private final boolean interrupting;
    private final BaseActivityNode activity;

    /**
     * Creates a boundary event.
     * @param id The node id
     * @param activity The attached activity
     * @param eventDef The event definition
     * @param interrupting True if the event interrupts the activity
     */
    public BoundaryEvent(String id, BaseActivityNode activity, EventDefinition eventDef, boolean interrupting) {
        super(id, activity.getLane(), eventDef);
        this.activity = activity;
        this.interrupting = interrupting;
    }

    /**
     * The activity to which this event is attached.
     * @return The attached activity
     */
    public BaseActivityNode getActivity() {
        return activity;
    }

    /**
     * Does activation of this event interrupt the attached
     * activity?
     * @return True if event if interrupting
     */
    public boolean isInterrupting() {
        return interrupting;
    }
}
