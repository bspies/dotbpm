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

import dot.bpm.diagram.ConditionalFlow;
import dot.bpm.diagram.FlowNode;
import dot.bpm.diagram.SequenceFlow;
import dot.bpm.diagram.data.Expression;

public class SequenceFlowBuilder implements Builder<SequenceFlow> {

    private FlowNode source, target;
    private Expression condition;

    public SequenceFlowBuilder withSource(FlowNode source) {
        this.source = source;
        return this;
    }

    public SequenceFlowBuilder withTarget(FlowNode target) {
        this.target = target;
        return this;
    }

    public SequenceFlowBuilder withCondition(Expression expression) {
        this.condition = expression;
        return this;
    }

    public boolean hasSource() {
        return source != null;
    }

    public boolean hasTarget() {
        return target != null;
    }

    @Override public SequenceFlow build() {
        if (!hasSource() || !hasTarget()) {
            throw new IllegalStateException("Sequence flow must have both source and target");
        }
        return condition != null ?
                new ConditionalFlow(source, target, condition) :
                new SequenceFlow(source, target);
    }
}
