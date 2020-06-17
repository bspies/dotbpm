package dot.bpm.parser.internal;

import dot.bpm.diagram.SequenceFlow;
import dot.bpm.diagram.builder.Builder;
import dot.bpm.diagram.builder.DiagramBuilder;
import dot.bpm.diagram.builder.SequenceFlowBuilder;

class DeferredSequenceFlowBuilder implements Builder<SequenceFlow> {

    private String sourceId, targetId;
    private SequenceFlowBuilder builder;

    private DeferredSequenceFlowBuilder() {}

    static DeferredSequenceFlowBuilder forTarget(String targetId, SequenceFlowBuilder builder) {
        DeferredSequenceFlowBuilder dsf = new DeferredSequenceFlowBuilder();
        dsf.targetId = targetId;
        dsf.builder = builder;
        return dsf;
    }

    static DeferredSequenceFlowBuilder forSource(String sourceId, SequenceFlowBuilder builder) {
        DeferredSequenceFlowBuilder dsf = new DeferredSequenceFlowBuilder();
        dsf.sourceId = sourceId;
        dsf.builder = builder;
        return dsf;
    }

    static DeferredSequenceFlowBuilder forBoth(SequenceFlowBuilder builder) {
        DeferredSequenceFlowBuilder dsf = new DeferredSequenceFlowBuilder();
        dsf.builder = builder;
        return dsf;
    }

    boolean resolve(DiagramBuilder<?> diagramBuilder) {
        if (sourceId != null && !builder.hasSource()) {
            diagramBuilder.findNode(sourceId).ifPresent(flowNode -> builder.withSource(flowNode));
        }
        if (targetId != null && !builder.hasTarget()) {
            diagramBuilder.findNode(targetId).ifPresent(flowNode -> builder.withTarget(flowNode));
        }
        return isComplete();
    }

    boolean isComplete() {
        return builder.hasSource() && builder.hasTarget();
    }

    @Override
    public SequenceFlow build() {
        return builder.build();
    }
}
