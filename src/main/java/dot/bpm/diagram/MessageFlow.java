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
 * A message flow.
 */
public class MessageFlow {

    private Node source, target;

    public MessageFlow() {}

    public MessageFlow(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    /**
     * The source of the message.
     * @return The flow source
     */
    public Node getSource() {
        return source;
    }

    /**
     * The target of the message.
     * @return The flow target
     */
    public Node getTarget() {
        return target;
    }
}
