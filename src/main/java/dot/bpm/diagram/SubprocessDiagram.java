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
import java.util.Optional;

/**
 * Diagram for a sub-process.
 */
public class SubprocessDiagram extends AbstractNode implements Diagram {

    private final DiagramDelegate delegate = new DiagramDelegate();

    public SubprocessDiagram(Diagram parent, Lane lane, String id) {
        super(parent, lane, id);
    }

    @Override public Collection<Node> getNodes() {
        return delegate.getNodes();
    }

    @Override public Collection<SequenceFlow> getSequenceFlows() {
        return delegate.getSequenceFlows();
    }

    @Override public boolean addNode(Node node) {
        return delegate.addNode(node);
    }

    @Override
    public Optional<Node> findNode(String id) {
        return delegate.findNode(id);
    }

    @Override public boolean addFlow(SequenceFlow flow) {
        return delegate.addFlow(flow);
    }

    @Override public boolean addFlow(Node source, Node target) {
        return delegate.addFlow(source, target);
    }

    @Override public Diagram getParent() {
        return super.getParent();
    }

    @Override public Lane getLane() {
        return super.getLane();
    }
}
