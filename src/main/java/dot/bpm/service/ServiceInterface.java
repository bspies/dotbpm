package dot.bpm.service;

import java.util.Collection;

public interface ServiceInterface {
    /**
     * Returns all the operations associated with the service
     * interface.
     * @return The operations
     */
    Collection<Operation> getOperations();
}
