package io.github.neopixel.http.query;

import io.github.neopixel.http.Endpoint;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.Request;

/**
 * A request to a Web API.
 */
public class Query {

    private final Optional<QueryParameter[]> queryParameterList;
    private final Endpoint endpoint;

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
    public HttpUrl.Builder createRequest() {
        HttpUrl.Builder builder = Objects.requireNonNull(HttpUrl.get(endpoint.getURL()))
            .newBuilder();
        queryParameterList.ifPresent(queryParameters -> Arrays.stream(queryParameters).toList()
            .forEach(parameter -> builder.addQueryParameter(parameter.type().getKey(),
                parameter.value())));
        return builder;
    }

    public Query(Endpoint endpoint, QueryParameter... queryParameterList) {
        this.queryParameterList = Optional.ofNullable(queryParameterList);
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(Object o) {

        if (getClass() != o.getClass()) {
            return false;
        }

        Query other = (Query) o;

        if (endpoint.equals(other.endpoint)) {
            if (queryParameterList.isEmpty() && other.queryParameterList.isEmpty()) {
                return true;
            }
            if (queryParameterList.isEmpty() || other.queryParameterList.isEmpty()) {
                return false;
            }

            return Arrays.equals(queryParameterList.get(), other.queryParameterList.get());
        } else {
            return false;
        }

    }
}
