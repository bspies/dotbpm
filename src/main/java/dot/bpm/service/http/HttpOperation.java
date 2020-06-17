package dot.bpm.service.http;

import dot.bpm.diagram.messages.ExchangePattern;
import dot.bpm.diagram.messages.Schema;
import dot.bpm.service.Operation;

import java.net.URI;
import java.util.Optional;

public class HttpOperation implements Operation {

    private final URI endpoint;
    private final HttpMethod method;
    private final ExchangePattern exchangePattern;
    private final Schema schema;

    public HttpOperation(URI endpoint, HttpMethod method, ExchangePattern exchangePattern) {
        this(endpoint,  method, exchangePattern,null);
    }

    public HttpOperation(URI endpoint, HttpMethod method, ExchangePattern exchangePattern, Schema schema) {
        this.endpoint = endpoint;
        this.method = method;
        this.exchangePattern = exchangePattern;
        this.schema = schema;
    }

    @Override
    public URI getEndpoint() {
        return endpoint;
    }

    public HttpMethod getMethod() {
        return method;
    }

    @Override
    public ExchangePattern getExchangePattern() {
        return exchangePattern;
    }

    @Override
    public Optional<Schema> getSchema() {
        return Optional.ofNullable(schema);
    }
}
