package io.github.hypixel_api_wrapper.http.query;

import java.util.UUID;

public class QueryFactory {
    public Query getPlayer(UUID uuid) {
        return new PlayerQuery(uuid);
    }

    public Query getPlayer(String username) {
        return new PlayerQuery(username);
    }

    public Query getPlayerFriends(UUID uuid) {
        return new PlayerFriendsQuery(uuid);
    }

    public Query getPlayerFriends(String username) {
        return new PlayerFriendsQuery(username);
    }

    public Query getPlayerRecentGames(UUID uuid) {
        return new PlayerRecentGamesQuery(uuid);
    }

    public Query getPlayerRecentGames(String username) {
        return new PlayerRecentGamesQuery(username);
    }

    public Query getPlayerStatus(UUID uuid) {
        return new PlayerStatusQuery(uuid);
    }

    public Query getPlayerStatus(String username) {
        return new PlayerStatusQuery(username);
    }

    public Query getGuild(UUID uuid) {
        return new GuildQuery(uuid);
    }

    public Query getGuild(String username) {
        return new GuildQuery(username);
    }

}
