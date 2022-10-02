package io.github.neopixel.http;

import io.github.neopixel.http.cache.CachingStrategy;
import io.github.neopixel.http.query.HypixelQueryParameterTypes;
import io.github.neopixel.http.query.Query;
import io.github.neopixel.http.query.QueryParameter;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.UUID;

public class RequestController {

    private final RequestFactory requestFactory;
    private final CachingStrategy cachingStrategy;

    public RequestController(UUID apiKey, CachingStrategy cachingStrategy) {
        requestFactory = new RequestFactory(apiKey);
        this.cachingStrategy = cachingStrategy;
    }

    /**
     * Retrieves data from the API. Provide the endpoint and the query parameters needed.
     *
     * @param endpoint  The endpoint the data should be fetched from.
     * @param parameter Query parameters.
     * @return A {@link JSONHandler} wrapping the data retrieved from the API.
     */
    private JSONHandler retrieveData(Endpoint endpoint, QueryParameter parameter) {
        return requestFactory.send(new Query(endpoint, parameter));
    }

    public JSONHandler getPlayerByUUID(UUID uuid) {
        return retrieveData(Endpoint.PLAYER,
            new QueryParameter(HypixelQueryParameterTypes.UUID, uuid.toString()));
    }

    public JSONHandler getPlayerByUsername(String username) {
        return retrieveData(Endpoint.PLAYER,
            new QueryParameter(HypixelQueryParameterTypes.NAME, username));
    }

    public JSONHandler getPlayerFriendsByUUID(UUID uuid) {
        return retrieveData(Endpoint.PLAYER_FRIENDS,
            new QueryParameter(HypixelQueryParameterTypes.UUID, uuid.toString()));
    }

    public JSONHandler getPlayerFriendsByUsername(String username) {
        return retrieveData(Endpoint.PLAYER_FRIENDS,
            new QueryParameter(HypixelQueryParameterTypes.NAME, username));
    }

    public JSONHandler getPlayerRecentGamesByUUID(UUID uuid) {
        return retrieveData(Endpoint.PLAYER_RECENT_GAMES,
            new QueryParameter(HypixelQueryParameterTypes.UUID, uuid.toString()));
    }

    public JSONHandler getPlayerRecentGamesByUsername(String username) {
        return retrieveData(Endpoint.PLAYER_RECENT_GAMES,
            new QueryParameter(HypixelQueryParameterTypes.NAME, username));
    }

    public JSONHandler getPlayerStatusByUUID(UUID uuid) {
        return retrieveData(Endpoint.PLAYER_STATUS,
            new QueryParameter(HypixelQueryParameterTypes.UUID, uuid.toString()));
    }

    public JSONHandler getPlayerStatusByUsername(String username) {
        return retrieveData(Endpoint.PLAYER_STATUS,
            new QueryParameter(HypixelQueryParameterTypes.NAME, username));
    }

    public JSONHandler getGuildByPlayerUUID(UUID uuid) {
        return retrieveData(Endpoint.GUILD,
            new QueryParameter(HypixelQueryParameterTypes.UUID, uuid.toString()));
    }

    public JSONHandler getGuildByName(String name) {
        return retrieveData(Endpoint.GUILD,
            new QueryParameter(HypixelQueryParameterTypes.NAME, name));
    }

    public JSONHandler getGuildByID(String id) {
        return retrieveData(Endpoint.GUILD,
            new QueryParameter(HypixelQueryParameterTypes.GUILD_ID, id));
    }

    public JSONHandler getActiveBoosters() {
        return retrieveData(Endpoint.BOOSTERS, null);
    }

    public JSONHandler getLeaderboardInformation() {
        return retrieveData(Endpoint.LEADERBOARDS, null);
    }

    public JSONHandler getPunishmentStats() {
        return retrieveData(Endpoint.PUNISHMENTS, null);
    }

    public JSONHandler getAPIKeyInformation() {
        return retrieveData(Endpoint.API_KEY, null);
    }

}
