package dot.bpm.diagram.activities;

import dot.bpm.core.Attributes;
import dot.bpm.diagram.BaseFlowNode;
import dot.bpm.diagram.Lane;
import dot.bpm.diagram.data.ParameterSet;

public class ActivityNodeDelegate extends BaseFlowNode implements ActivityNode {

    private ParameterSet dataInput, dataOutput;
    private Attributes attributes;

    public ActivityNodeDelegate(String id, Lane lane) {
        super(id, lane);
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public ParameterSet getDataInput() {
        return dataInput;
    }

    public void setDataInput(ParameterSet dataInput) {
        this.dataInput = dataInput;
    }

    @Override
    public ParameterSet getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(ParameterSet dataOutput) {
        this.dataOutput = dataOutput;
    }
}
