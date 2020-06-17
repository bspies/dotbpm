package dot.bpm.diagram.messages;

import java.net.URI;

/**
 * Represents a schema against which a specific data format can be validated.
 */
public class Schema {

    private final String schemaId;
    private final URI schemaLocation;

    public Schema(String schemaId, URI schemaLocation) {
        this.schemaId = schemaId;
        this.schemaLocation = schemaLocation;
    }

    /**
     * Returns the id of the schema, e.g. "http://www.w3.org/2001/XMLSchema" for XML
     * Schema or "http://json-schema.org/draft-07/schema#" for JSON Schema, Draft 7.
     * @return The schema id
     */
    public String getSchemaId() {
        return schemaId;
    }

    /**
     * The location of the schema.
     * @return The schema location
     */
    public URI getSchemaLocation() {
        return schemaLocation;
    }
}
