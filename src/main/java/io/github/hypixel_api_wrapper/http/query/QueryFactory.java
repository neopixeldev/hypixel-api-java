package io.github.hypixel_api_wrapper.http.query;

import java.util.UUID;

public class QueryFactory {
    public Query getPlayerByUUIDQuery(UUID uuid) {
        return new PlayerByUUIDQuery(uuid);
    }
    
    public Query getPlayerByUsername(String username) {
        return new PlayerQuery(username);
    }

    public Query getPlayerFriendsByUUID(UUID uuid) {
        return new FriendsByUUIDQuery(uuid);
    }

    public Query getPlayerFriendsByUsername(String username) {
        return new FriendsByUsernameQuery(username);
    }

    public Query getPlayerRecentGamesByUUID(UUID uuid) {
        return new RecentGamesByUUIDQuery(uuid);
    }

    public Query getPlayerRecentGamesByUsername(String username) {
        return new RecentGamesByUsernameQuery(username);
    }

    public Query getPlayerStatusByUUID(UUID uuid) {
        return new PlayerStatusByUUIDQuery(uuid);
    }

    public Query getPlayerStatusByUsername(String username) {
        return new PlayerStatusByUsernameQuery(username);
    }

}
