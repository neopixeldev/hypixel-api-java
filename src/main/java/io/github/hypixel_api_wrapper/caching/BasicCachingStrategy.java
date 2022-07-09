package io.github.hypixel_api_wrapper.caching;

import io.github.hypixel_api_wrapper.util.Endpoint;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * An implementation of {@link CachingStrategy} that uses a HashMap to store the data.
 */
public class BasicCachingStrategy implements CachingStrategy {

    private final Map<Endpoint, JSONObject> cache = new HashMap<>();

    @Override
    public void cacheResponse(Endpoint endpoint, JSONObject res) {
        cache.put(endpoint, res);
    }

    @Override
    public JSONObject getCachedResponse(Endpoint endpoint) {
        return cache.get(endpoint);
    }

    @Override
    public void clearCache() {
        cache.clear();
    }
}
