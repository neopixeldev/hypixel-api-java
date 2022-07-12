package io.github.hypixel_api_wrapper;

import io.github.hypixel_api_wrapper.caching.CachingStrategy;
import io.github.hypixel_api_wrapper.caching.NoCachingStrategy;
import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.util.Endpoint;
import java.io.IOException;

public class HypixelAPI {

    private final String key;

    private HypixelAPI(String key) {
        this.key = key;
    }

    /**
     * Creates a new instance of the HypixelAPI object with caching disabled.
     *
     * @param key the api key to use for authentication
     * @return the newly created instance
     */
    public static HypixelAPI create(String key) {
        return create(key, new NoCachingStrategy());
    }

    /**
     * Creates a new instance of the HypixelAPI object
     *
     * @param key             the api key to use for authentication
     * @param cachingStrategy the caching strategy to use. If null is passed the NoCachingStrategy
     *                        will be used to disable caching
     * @return the newly created instance
     */
    public static HypixelAPI create(String key, CachingStrategy cachingStrategy) {
        RequestFactory.start(cachingStrategy);
        return new HypixelAPI(key);
    }

    public static void shutdown() throws IOException {
        RequestFactory.close();
    }
}
