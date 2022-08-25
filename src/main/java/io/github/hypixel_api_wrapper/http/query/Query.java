package io.github.hypixel_api_wrapper.http.query;

import okhttp3.HttpUrl;
import okhttp3.Request;

/**
 * A request to a Web API.
 */
public abstract class Query {

    /**
     * Begins building a new HTTP request that can be used to make the query.
     * <p>
     * The returned {@link Request.Builder builder} will always have at least its
     * <code>URL</code> configured, but may also include headers, a body, or
     * any other information relevant to the query.
     *
     * @return A minimally-configured HTTP request with only the information relevant to the query
     * itself.
     * @apiNote A builder is returned instead of a finalized {@link Request request} so that the
     * caller can attach any additional information it needs to the request, such as a user-agent or
     * API credentials.
     */
    public abstract HttpUrl.Builder createRequest();

    @SuppressWarnings("unused")
    Query() {
        // package-private so that all implementations must be in this package.
    }
}
