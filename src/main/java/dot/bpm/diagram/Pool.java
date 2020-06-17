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

import dot.bpm.diagram.messages.Messageable;

import java.util.Collection;
import java.util.Collections;

/**
 * Describes a participant in the workflow.
 *
 * @author Brennan Spies
 */
public class Pool implements FlowContainer, Messageable {

    private final boolean main;
    private final String id, name;
    private final Collection<Lane> lanes;

    public Pool(String id, String name, Collection<Lane> lanes) {
        this(id, name, lanes, false);
    }

    public Pool(String id, String name, Collection<Lane> lanes, boolean isMain) {
        this.id = id;
        this.name = name;
        this.lanes = Collections.unmodifiableCollection(lanes);
        this.main = isMain;
    }

    /**
     * The pool id.
     * @return The pool's id
     */
    @Override public String getId() {
        return id;
    }

    /**
     * The pool name.
     * @return The pool's name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns true if this is the main pool in the process.
     * @return True if this is main pool
     */
    public boolean isMain() {
        return main;
    }

    /**
     * Returns the lanes contained by this pool (must be at least one).
     * @return The swim lanes
     */
    public Collection<Lane> getLanes() {
        return lanes;
    }
}
