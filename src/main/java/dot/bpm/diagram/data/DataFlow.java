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
package dot.bpm.diagram.data;

import dot.bpm.diagram.activities.BaseActivityNode;

/**
 * A data flow in a process.
 */
public class DataFlow {

    public enum Direction { INFLOW, OUTFLOW };

    private final Direction direction;
    private final BaseActivityNode activityNode;
    private final DataElement dataElement;

    public DataFlow(BaseActivityNode source, DataElement dataElement) {
        this.activityNode = source;
        this.dataElement = dataElement;
        this.direction = Direction.OUTFLOW;
    }

    public DataFlow(DataElement dataElement, BaseActivityNode target) {
        this.dataElement = dataElement;
        this.activityNode = target;
        this.direction = Direction.INFLOW;
    }

    public Direction getDirection() {
        return direction;
    }

    public BaseActivityNode getActivityNode() {
        return activityNode;
    }

    public DataElement getDataElement() {
        return dataElement;
    }
}
