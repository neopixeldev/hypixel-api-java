package io.github.hypixel_api_wrapper.http.query;

import java.net.URI;
import java.net.http.HttpRequest;

/**
 * A request to a Web API.
 */
public abstract class Query {

    /**
     * Begins building a new HTTP request that can be used to make the query.
     * <p>
     * The returned {@link HttpRequest.Builder builder} will always have at least its
     * {@link HttpRequest.Builder#uri(URI) URL} configured, but may also include headers, a body, or
     * any other information relevant to the query.
     *
     * @return A minimally-configured HTTP request with only the information relevant to the query
     * itself.
     * @apiNote A builder is returned instead of a finalized {@link HttpRequest request} so that the
     * caller can attach any additional information it needs to the request, such as a user-agent or
     * API credentials.
     */
    public abstract HttpRequest.Builder createRequest();

    @SuppressWarnings("unused")
    Query() {
        // package-private so that all implementations must be in this package.
    }
}
