package dot.bpm.diagram.activities;

import dot.bpm.diagram.FlowNode;
import dot.bpm.diagram.data.ParameterSet;
import dot.bpm.diagram.messages.Messageable;

/**
 * A flow node for an activity.
 *
 * @author Brennan Spies
 */
public interface ActivityNode extends FlowNode, Messageable {
    /**
     * Gets the data input parameters.
     * @return The data input parameters
     */
    ParameterSet getDataInput();

    /**
     * Gets the data output parameters.
     * @return The data output parameters
     */
    ParameterSet getDataOutput();
}
