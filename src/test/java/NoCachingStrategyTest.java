import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.http.cache.NoCachingStrategy;
import io.github.hypixel_api_wrapper.http.Endpoint;
import java.util.concurrent.CompletableFuture;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoCachingStrategyTest {

    private final Endpoint endpoint = Endpoint.API_KEY;
    private final JSONObject object = new JSONObject();
    private CachingStrategy cachingStrategy;

    @BeforeEach
    void beforeEach() {
        this.cachingStrategy = new NoCachingStrategy();
    }

    @Test
    void testNoCaching() {
        this.cachingStrategy.cacheResponse(endpoint, CompletableFuture.completedFuture(object));

        assertNull(this.cachingStrategy.getCachedResponse(endpoint));
    }

    @Test
    void testAlwaysInvalid() {
        assertFalse(this.cachingStrategy.isCacheValid(endpoint));
        this.cachingStrategy.cacheResponse(endpoint, CompletableFuture.completedFuture(object));
        assertFalse(this.cachingStrategy.isCacheValid(endpoint));
    }

}
