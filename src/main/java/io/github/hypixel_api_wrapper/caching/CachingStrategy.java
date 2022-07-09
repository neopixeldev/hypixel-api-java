package io.github.hypixel_api_wrapper.caching;

import io.github.hypixel_api_wrapper.util.Endpoint;
import org.json.JSONObject;

public interface CachingStrategy {
    void cacheResponse(Endpoint endpoint, JSONObject res);
    JSONObject getCachedResponse(Endpoint endpoint);
    void clearCache();
}
