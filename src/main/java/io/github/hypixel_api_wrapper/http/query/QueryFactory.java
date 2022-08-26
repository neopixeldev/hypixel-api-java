package io.github.hypixel_api_wrapper.http.query;

import java.util.UUID;

public class QueryFactory {
    public Query getPlayerByUUIDQuery(UUID uuid) {
        return new PlayerByUUIDQuery(uuid);
    }
    
    public Query getPlayerByUsername(String username) {
        return new PlayerByUsernameQuery(username);
    }

    public Query getPlayerFriendsByUUID(UUID uuid) {
        return new FriendsByUUIDQuery(uuid);
    }

    public Query getPlayerFriendsByUsername(String username) {
        return new FriendsByUsernameQuery(username);
    }
}
