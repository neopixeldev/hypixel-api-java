package io.github.hypixel_api_wrapper.http.cache;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.util.concurrent.CompletableFuture;
import org.json.JSONObject;

/**
 * An implementation of {@link CachingStrategy} that does not cache any data and always declares the
 * cache as invalid
 */
public class NoCachingStrategy implements CachingStrategy {

    @Override
    public void cacheResponse(Endpoint endpoint, CompletableFuture<JSONObject> res) {
        // unsupported
    }

    @Override
    public CompletableFuture<JSONObject> getCachedResponse(Endpoint endpoint) {
        // unsupported
        return null;
    }

    @Override
    public boolean isCacheValid(Endpoint endpoint) {
        // unsupported
        return false;
    }

    @Override
    public void removeCachedResponse(Endpoint endpoint) {
        // unsupported
    }

    @Override
    public void clearCache() {
        // unsupported
    }
}
