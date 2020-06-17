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
package dot.bpm.diagram.builder;

import dot.bpm.core.Attributes;
import dot.bpm.diagram.*;
import dot.bpm.diagram.data.ParameterSet;
import dot.bpm.diagram.messages.MessageFlow;

import java.util.Collection;
import java.util.HashSet;

/**
 * Builder for a process diagram.
 *
 * @author Brennan Spies
 */
public class ProcessDiagramBuilder implements Builder<ProcessDiagram> {

    private String name, description;
    private DiagramDelegate delegate;
    private final Collection<Pool> pools;
    private final Collection<MessageFlow> messageFlows;
    private Attributes attributes;
    private ParameterSet inputs;

    public ProcessDiagramBuilder() {
        delegate = new DiagramDelegate();
        pools = new HashSet<>();
        messageFlows = new HashSet<>();
    }

    public ProcessDiagramBuilder withNode(FlowNode node) {
        delegate.addNode(node);
        return this;
    }

    public ProcessDiagramBuilder withSequenceFlow(SequenceFlow flow) {
        delegate.addNode(flow.getSource());
        delegate.addNode(flow.getTarget());
        delegate.addSequenceFlow(flow);
        return this;
    }

    public ProcessDiagramBuilder withSequenceFlow(FlowNode source, FlowNode target) {
        return withSequenceFlow(new SequenceFlow(source, target));
    }

    public ProcessDiagramBuilder withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProcessDiagramBuilder withInputs(ParameterSet inputs) {
        this.inputs = inputs;
        return this;
    }

    public ProcessDiagramBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ProcessDiagramBuilder withName(String name) {
        this.name = name;
        return this;
    }

    @Override public ProcessDiagram build() {
        return new ProcessDiagram(name, description, attributes, delegate);
    }
}
