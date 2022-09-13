package io.github.neopixel.http.cache;

import io.github.neopixel.http.Endpoint;
import org.json.JSONObject;

public interface CachingStrategy {

    /**
     * Saves the response of an endpoint to the cache
     *
     * @param endpoint the endpoint from where the response came from
     * @param res      the json response
     */
    void cacheResponse(Endpoint endpoint, JSONObject res);

    /**
     * Gets a response of the cache
     *
     * @param endpoint the endpoint where the object came from
     * @return the response if one for the given endpoint was cached. {@code null} if not
     */
    JSONObject getCachedResponse(Endpoint endpoint);

    /**
     * Checks if a cached object is still judged as valid based on the time since caching
     *
     * @param endpoint the endpoint of the cached response
     * @return {@code true} if it's still valid {@code false} if not
     */
    boolean isCacheValid(Endpoint endpoint);

    /**
     * Removes a response from the cache if it has been cached before.
     *
     * @param endpoint the endpoint to the response came from
     */
    void removeCachedResponse(Endpoint endpoint);

    /**
     * Clears the entire cache
     */
    void clearCache();
}
