package io.github.neopixel.http;

import io.github.neopixel.http.cache.CachingStrategy;
import io.github.neopixel.http.query.Query;
import io.github.neopixel.http.query.QueryFactory;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.UUID;
import org.json.JSONObject;

public class RequestController {

    private final RequestFactory requestFactory;
    private final QueryFactory queryFactory = new QueryFactory();

    public RequestController(UUID apiKey, CachingStrategy cachingStrategy) {
        requestFactory = new RequestFactory(apiKey, cachingStrategy);
    }

    public JSONHandler getPlayer(UUID uuid) {
        Query query = queryFactory.getPlayer(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayer(String username) {
        Query query = queryFactory.getPlayer(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerFriends(UUID uuid) {
        Query query = queryFactory.getPlayerFriends(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerFriends(String username) {
        Query query = queryFactory.getPlayerFriends(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerRecentGames(UUID uuid) {
        Query query = queryFactory.getPlayerRecentGames(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerRecentGames(String username) {
        Query query = queryFactory.getPlayerRecentGames(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerStatus(UUID uuid) {
        Query query = queryFactory.getPlayerStatus(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getPlayerStatus(String username) {
        Query query = queryFactory.getPlayerStatus(username);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getGuild(UUID uuid) {
        Query query = queryFactory.getGuild(uuid);
        return requestFactory.send(query.createRequest());
    }

    public JSONHandler getGuild(String name) {
        Query query = queryFactory.getGuild(name);
        return requestFactory.send(query.createRequest());
    }
}
