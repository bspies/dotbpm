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
package dot.bpm.diagram;

/**
 * Base class for diagram graph nodes.
 *
 * @author Brennan Spies
 */
public abstract class BaseFlowNode implements FlowNode {

    private final Lane lane;
    private final String id;

    public BaseFlowNode(String id, Lane lane) {
        this.lane = lane;
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override public String getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    @Override public Lane getLane() {
        return lane;
    }
}