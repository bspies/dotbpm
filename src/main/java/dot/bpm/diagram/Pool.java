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

import java.util.Collection;
import java.util.HashSet;

/**
 * Describes a participant in the workflow.
 */
public class Pool extends AbstractElement {

    private boolean main = false;
    private String name;
    private Collection<Lane> lanes;

    public Pool(Diagram parent, String name) {
        super(parent);
        this.name = name;
        this.lanes = new HashSet<>();
    }

    public Pool(Diagram diagram, String name, boolean isMain) {
        this(diagram, name);
        setMain(isMain);
    }

    /**
     * Returns true if this is the main pool in the process.
     * @return True if this is main pool
     */
    public boolean isMain() {
        return main;
    }

    /**
     * Sets the main flag to indicate whether or not
     * this pool is the main one.
     * @param isMainPool True if this pool is main
     */
    public void setMain(boolean isMainPool) {
        this.main = isMainPool;
    }

    /**
     * The name of this pool.
     * @return The pool name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the lanes contained by this pool (must be at least one).
     * @return The swim lanes
     */
    public Collection<Lane> getLanes() {
        return lanes;
    }

    /**
     * Adds a lane to this pool.
     * @param lane The lane to add
     * @return True if lane added
     */
    public boolean addLane(Lane lane) {
        return lanes.add(lane);
    }
}
