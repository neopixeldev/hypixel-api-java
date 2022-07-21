import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.hypixel_api_wrapper.http.cache.BasicCachingStrategy;
import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.http.Endpoint;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicCachingStrategyTest {

    private final long validCacheTime = 10;
    private final Endpoint endpoint = Endpoint.API_KEY;
    private final JSONObject object = new JSONObject();

    private MockClock mockClock;
    private CachingStrategy strategy;

    @BeforeEach
    void beforeEach() {
        Pair<MockClock, CachingStrategy> pair = createStrategy();
        this.mockClock = pair.getLeft();
        this.strategy = pair.getRight();
    }

    @Test
    void testAdd() throws ExecutionException, InterruptedException {
        JSONObject object = new JSONObject();
        object.append("foo", 1);

        strategy.cacheResponse(endpoint, CompletableFuture.completedFuture(object));

        assertEquals(object, strategy.getCachedResponse(endpoint).get());
    }

    @Test
    void testRemoval() {
        strategy.cacheResponse(endpoint, CompletableFuture.completedFuture(new JSONObject()));
        strategy.removeCachedResponse(endpoint);

        assertNull(strategy.getCachedResponse(endpoint));
    }

    // TODO: Maybe add negative time too but that needs discussion whether it's valid or invalid

    @Test
    void testValidTime() {
        strategy.cacheResponse(endpoint, CompletableFuture.completedFuture(object));

        assertTrue(strategy.isCacheValid(endpoint));

        mockClock.plusMillis(validCacheTime);

        assertTrue(strategy.isCacheValid(endpoint));
    }

    @Test
    void testInvalidTime() {
        strategy.cacheResponse(endpoint, CompletableFuture.completedFuture(object));

        mockClock.plusMillis(validCacheTime + 1);

        assertFalse(strategy.isCacheValid(endpoint));
    }

    Pair<MockClock, CachingStrategy> createStrategy() {
        MockClock clock = new MockClock(Instant.ofEpochMilli(0));
        CachingStrategy cachingStrategy = new BasicCachingStrategy(validCacheTime, clock);

        return Pair.of(clock, cachingStrategy);
    }

}
