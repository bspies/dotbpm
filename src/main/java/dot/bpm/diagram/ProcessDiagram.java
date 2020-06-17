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

import dot.bpm.core.Attributes;
import dot.bpm.diagram.data.DataFlow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

/**
 * A process definition diagram.
 *
 *  @author Brennan Spies
 */
public class ProcessDiagram implements Diagram {

    private final String name;
    private final String description;
    private final Collection<Pool> pools;
    private final DiagramDelegate delegate;

    public ProcessDiagram(String name, String description, Attributes attributes, Collection<Pool> pools, DiagramDelegate delegate) {
        this.name = name;
        this.description = description;
        this.pools = Collections.unmodifiableCollection(pools);
        this.delegate = delegate;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public Collection<Pool> getPools() {
        return pools;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<FlowNode> getNodes() {
        return delegate.getNodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<DataFlow> getDataFlows() {
        return delegate.getDataFlows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<FlowNode> findNode(String id) {
        return delegate.findNode(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return delegate.getSequenceFlows();
    }
}
