package io.github.neopixel.http;

import io.github.neopixel.http.query.HypixelQueryParameterTypes;
import io.github.neopixel.http.query.Query;
import io.github.neopixel.http.query.QueryParameter;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.UUID;
import okhttp3.Cache;

/**
 * Encapsulates, controls, sends, and recieves requests to and from the Hypixel API. Methods are
 * overriden and delegate the correct {@link Query query} for the requested
 * {@link Endpoint endpoint}.
 */
public class RequestController {

    private final RequestFactory requestFactory;

    public RequestController(UUID apiKey) {
        requestFactory = new RequestFactory(apiKey);
    }

    public RequestController(UUID apiKey, Cache cache) {
        requestFactory = new RequestFactory(apiKey, cache);
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
            new QueryParameter(HypixelQueryParameterTypes.GUILD_BY_PLAYER, uuid.toString()));
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

    public JSONHandler getSkyblockNews() {
        return retrieveData(Endpoint.SKYBLOCK_NEWS, null);
    }

    public JSONHandler getSkyblockElection() {
        return retrieveData(Endpoint.SKYBLOCK_ELECTIONS, null);
    }

    public JSONHandler getSkyblockProfile(String profileId) {
        return retrieveData(Endpoint.SKYBLOCK_SINGLE_PROFILE,
            new QueryParameter(HypixelQueryParameterTypes.SKYBLOCK_PROFILE_ID, profileId));
    }

}
