package dot.bpm.service;

import dot.bpm.diagram.messages.ExchangePattern;
import dot.bpm.diagram.messages.Schema;

import java.net.URI;
import java.util.Optional;

public interface Operation {
    /**
     * The endpoint of the operation.
     * @return The endpoint address
     */
    URI getEndpoint();

    /**
     * The message exchange pattern.
     * @return The exchange pattern
     */
    ExchangePattern getExchangePattern();

    /**
     * The schema of the operation, if defined.
     * @return The schema
     */
    Optional<Schema> getSchema();
}
