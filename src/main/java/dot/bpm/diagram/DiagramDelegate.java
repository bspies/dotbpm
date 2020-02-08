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
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * A delegate implementation of the Diagram interface, for use by
 * the process and subprocess diagrams.
 */
class DiagramDelegate implements Diagram {

    private final Set<Node> nodes = new HashSet<>();
    private final Set<SequenceFlow> sequenceFlows = new HashSet<>();

    @Override
    public Collection<Node> getNodes() {
        return Collections.unmodifiableSet(nodes);
    }

    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return Collections.unmodifiableSet(sequenceFlows);
    }

    @Override
    public void addNode(Node node) {
        nodes.add(node);
    }

    @Override
    public void addFlow(SequenceFlow flow) {
        nodes.add(flow.getSource());
        nodes.add(flow.getTarget());
        sequenceFlows.add(flow);
    }

    @Override
    public void addFlow(Node source, Node target) {
        addFlow(new SequenceFlow(source, target));
    }
}
