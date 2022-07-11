package io.github.hypixel_api_wrapper.caching;

import io.github.hypixel_api_wrapper.util.Endpoint;
import org.json.JSONObject;

/**
 * An implementation of {@link CachingStrategy} that does not cache any data and always declares the
 * cache as invalid
 */
public class NoCachingStrategy implements CachingStrategy {

    @Override
    public void cacheResponse(Endpoint endpoint, JSONObject res) {
    }

    @Override
    public JSONObject getCachedResponse(Endpoint endpoint) {
        return null;
    }

    @Override
    public boolean isCacheValid(Endpoint endpoint) {
        return false;
    }

    @Override
    public void removeCachedResponse(Endpoint endpoint) {
    }

    @Override
    public void clearCache() {
    }
}
