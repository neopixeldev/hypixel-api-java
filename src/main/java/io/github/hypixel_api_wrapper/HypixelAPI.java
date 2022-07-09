package io.github.hypixel_api_wrapper;

import io.github.hypixel_api_wrapper.caching.CachingStrategy;
import io.github.hypixel_api_wrapper.http.RequestFactory;

import java.io.IOException;

public class HypixelAPI {
    private final String key;
    private HypixelAPI(String key) {
        this.key = key;
    }
    public static HypixelAPI create(String key, CachingStrategy cachingStrategy) {
        RequestFactory.start(cachingStrategy);
        return new HypixelAPI(key);
    }
    public static void shutdown() throws IOException {
        RequestFactory.close();
    }
}
