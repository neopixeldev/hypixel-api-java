package io.github.hypixel_api_wrapper.http.cache;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONObject;

/**
 * An implementation of {@link CachingStrategy} that uses a HashMap to store the data.
 */
public class BasicCachingStrategy implements CachingStrategy {

    private final long validCacheTime;
    private final Clock clock;
    // The long in the value Pair are the current time ms
    private final Map<Endpoint, Pair<CompletableFuture<JSONObject>, Long>> cache = new HashMap<>();

    /**
     * Creates a new {@link BasicCachingStrategy} with a valid cache time of 20s
     */
    public BasicCachingStrategy() {
        this.validCacheTime = 20000;
        this.clock = Clock.systemUTC();
    }

    public BasicCachingStrategy(long validCacheTime) {
        this.validCacheTime = validCacheTime;
        this.clock = Clock.systemUTC();
    }

    public BasicCachingStrategy(long validCacheTime, Clock clock) {
        this.validCacheTime = validCacheTime;
        this.clock = clock;
    }

    @Override
    public void cacheResponse(Endpoint endpoint, CompletableFuture<JSONObject> res) {
        cache.put(endpoint, Pair.of(res, clock.millis()));
    }

    @Override
    public CompletableFuture<JSONObject> getCachedResponse(Endpoint endpoint) {
        Pair<CompletableFuture<JSONObject>, Long> pair = cache.get(endpoint);
        return pair == null ? null : pair.getLeft();
    }

    @Override
    public boolean isCacheValid(Endpoint endpoint) {
        Pair<CompletableFuture<JSONObject>, Long> pair = cache.get(endpoint);
        return pair != null && clock.millis() <= pair.getRight() + validCacheTime;
    }

    @Override
    public void removeCachedResponse(Endpoint endpoint) {
        cache.remove(endpoint);
    }

    @Override
    public void clearCache() {
        cache.clear();
    }
}
