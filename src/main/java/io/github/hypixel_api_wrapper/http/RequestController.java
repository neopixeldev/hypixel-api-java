package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import java.util.UUID;

public class RequestController {

    private final RequestFactory requestFactory;

    public RequestController(UUID apiKey, CachingStrategy cachingStrategy) {
        requestFactory = new RequestFactory(apiKey, cachingStrategy);
    }

}
