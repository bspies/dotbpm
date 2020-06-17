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
 * A sequence flow between two flow objects in the diagram.
 *
 * @author Brennan Spies
 */
public class SequenceFlow {

    private final FlowNode target;
    private final FlowNode source;

    public SequenceFlow(FlowNode source, FlowNode target) {
        this.source = source;
        this.target = target;
    }

    public FlowNode getSource() {
        return source;
    }

    public FlowNode getTarget() {
        return target;
    }

    public static Builder builder() {
        return new Builder();
    };

    /**
     * Builder for {@code SequenceFlow}.
     */
    public static class Builder implements dot.bpm.diagram.builder.Builder<SequenceFlow> {

        private FlowNode target;
        private FlowNode source;

        public Builder withSource(FlowNode source) {
            this.source = source;
            return this;
        }

        public Builder withTarget(FlowNode target) {
            this.target = target;
            return this;
        }

        @Override public SequenceFlow build() {
            return new SequenceFlow(source, target);
        }
    }
}
