import io.github.hypixel_api_wrapper.io.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.io.http.cache.NoCachingStrategy;
import io.github.hypixel_api_wrapper.io.http.Endpoint;
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
        this.cachingStrategy.cacheResponse(endpoint, object);

        assertNull(this.cachingStrategy.getCachedResponse(endpoint));
    }

    @Test
    void testAlwaysInvalid() {
        assertFalse(this.cachingStrategy.isCacheValid(endpoint));
        this.cachingStrategy.cacheResponse(endpoint, object);
        assertFalse(this.cachingStrategy.isCacheValid(endpoint));
    }

}
