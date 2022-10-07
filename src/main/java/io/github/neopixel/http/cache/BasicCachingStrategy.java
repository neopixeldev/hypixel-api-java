package io.github.neopixel.http.cache;

import io.github.neopixel.http.Endpoint;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Clock;
import java.util.EnumMap;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONObject;

/**
 * An implementation of {@link CachingStrategy} that uses a HashMap to store the data.
 */
public class BasicCachingStrategy implements CachingStrategy {

    private final long validCacheTime;
    private final Clock clock;
    // The long in the value Pair are the current time ms
    private final Map<Endpoint, Pair<JSONHandler, Long>> cache = new EnumMap<>(Endpoint.class);

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
    public void cacheResponse(Endpoint endpoint, JSONHandler jsonHandler) {
        cache.put(endpoint, Pair.of(jsonHandler, clock.millis()));
    }

    @Override
    public JSONHandler getCachedResponse(Endpoint endpoint) {
        Pair<JSONHandler, Long> pair = cache.get(endpoint);
        return pair == null ? null : pair.getLeft();
    }

    @Override
    public boolean isCacheValid(Endpoint endpoint) {
        Pair<JSONHandler, Long> pair = cache.get(endpoint);
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
