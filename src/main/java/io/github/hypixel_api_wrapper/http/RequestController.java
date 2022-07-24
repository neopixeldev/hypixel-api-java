package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.http.query.QueryFactory;
import java.util.UUID;
import org.json.JSONObject;

public class RequestController {

    private final RequestFactory requestFactory;
    private final QueryFactory queryFactory = new QueryFactory();

    public RequestController(UUID apiKey, CachingStrategy cachingStrategy) {
        requestFactory = new RequestFactory(apiKey, cachingStrategy);
    }

    public JSONObject getPlayerByUUID(UUID uuid) {
        return requestFactory.send(queryFactory.getPlayerByUUIDQuery(uuid).createRequest());
    }

}
