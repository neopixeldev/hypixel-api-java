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

    public JSONObject getPlayer(UUID uuid) {
        Query query = queryFactory.getPlayer(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayer(String username) {
        Query query = queryFactory.getPlayer(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerFriends(UUID uuid) {
        Query query = queryFactory.getPlayerFriends(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerFriends(String username) {
        Query query = queryFactory.getPlayerFriends(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerRecentGames(UUID uuid) {
        Query query = queryFactory.getPlayerRecentGames(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerRecentGames(String username) {
        Query query = queryFactory.getPlayerRecentGames(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerStatus(UUID uuid) {
        Query query = queryFactory.getPlayerStatus(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getPlayerStatus(String username) {
        Query query = queryFactory.getPlayerStatus(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getGuild(UUID uuid) {
        Query query = queryFactory.getGuild(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONObject getGuild(String username) {
        Query query = queryFactory.getGuild(username);
        return requestFactory.send(query.createRequest());
    }
}
