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

import dot.bpm.diagram.activities.ActivityNode;
import dot.bpm.diagram.activities.ActivityNodeDelegate;
import dot.bpm.diagram.data.DataFlow;
import dot.bpm.diagram.data.ParameterSet;

import java.util.Collection;
import java.util.Optional;

/**
 * Diagram for a sub-process.
 *
 * @author Brennan Spies
 */
public class SubprocessDiagram implements ActivityNode, Diagram {

    private final DiagramDelegate diagramDelegate;
    private final ActivityNodeDelegate activityDelegate;

    public SubprocessDiagram(ActivityNodeDelegate activityDelegate, DiagramDelegate diagramDelegate) {
        this.activityDelegate = activityDelegate;
        this.diagramDelegate = diagramDelegate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId() {
        return activityDelegate.getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lane getLane() {
        return activityDelegate.getLane();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<FlowNode> getNodes() {
        return diagramDelegate.getNodes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<DataFlow> getDataFlows() {
        return diagramDelegate.getDataFlows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection<SequenceFlow> getSequenceFlows() {
        return diagramDelegate.getSequenceFlows();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<FlowNode> findNode(String id) {
        return diagramDelegate.findNode(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParameterSet getDataInput() {
        return activityDelegate.getDataInput();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ParameterSet getDataOutput() {
        return activityDelegate.getDataOutput();
    }
}
