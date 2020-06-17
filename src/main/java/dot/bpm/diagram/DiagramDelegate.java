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

import dot.bpm.diagram.data.DataFlow;

import java.util.*;

/**
 * A delegate implementation of the Diagram interface, for use by
 * the process and subprocess diagrams.
 *
 * @author Brennan Spies
 */
public class DiagramDelegate implements Diagram {

    private final Map<String, FlowNode> nodes;
    private final Set<SequenceFlow> sequenceFlows;
    private final Set<DataFlow> dataFlows;

    public DiagramDelegate() {
        nodes = new HashMap<>();
        dataFlows = new HashSet<>();
        sequenceFlows = new HashSet<>();
    }

    @Override
    public Collection<FlowNode> getNodes() {
        return Collections.unmodifiableCollection(nodes.values());
    }

    @Override
    public Collection<DataFlow> getDataFlows() {
        return Collections.unmodifiableCollection(dataFlows);
    }

    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return Collections.unmodifiableSet(sequenceFlows);
    }

    public boolean addNode(FlowNode node) {
        return nodes.putIfAbsent(node.getId(), node) == null;
    }

    @Override
    public Optional<FlowNode> findNode(String id) {
        if (id == null) {
            throw new IllegalArgumentException("The 'id' argument cannot be null");
        }
        return Optional.ofNullable(nodes.get(id));
    }

    public boolean addDataFlow(DataFlow dataFlow) {
        return dataFlows.add(dataFlow);
    }

    public boolean addSequenceFlow(SequenceFlow flow) {
        addNode(flow.getSource());
        addNode(flow.getTarget());
        return sequenceFlows.add(flow);
    }

    public boolean addSequenceFlow(FlowNode source, FlowNode target) {
        return addSequenceFlow(new SequenceFlow(source, target));
    }
}
