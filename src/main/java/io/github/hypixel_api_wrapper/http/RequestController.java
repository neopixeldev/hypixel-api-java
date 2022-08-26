package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import io.github.hypixel_api_wrapper.http.query.Query;
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
        Query query = queryFactory.getPlayerByUUIDQuery(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerByUsername(String username) {
        Query query = queryFactory.getPlayerByUsername(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerFriendsByUUID(UUID uuid) {
        Query query = queryFactory.getPlayerFriendsByUUID(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerFriendsByUsername(String username) {
        Query query = queryFactory.getPlayerFriendsByUsername(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerRecentGamesByUsername(String username) {
        Query query = queryFactory.getPlayerRecentGamesByUsername(username);
        return requestFactory.send(query.createRequest());
    }
}
