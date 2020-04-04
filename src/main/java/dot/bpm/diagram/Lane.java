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
 * Represents a subdivision of a {@link Pool}, e.g. a
 * particular role within that pool.
 */
public class Lane extends AbstractElement {

    private String name;
    private Pool pool;

    public Lane(Pool pool, String name) {
        super(pool.getParent());
        this.name = name;
        this.pool = pool;
        pool.addLane(this);
    }

    public String getName() {
        return name;
    }

    public Pool getPool() {
        return pool;
    }
}
