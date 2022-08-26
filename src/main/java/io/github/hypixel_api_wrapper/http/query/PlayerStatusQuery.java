package io.github.hypixel_api_wrapper.http.query;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.util.UUID;
import okhttp3.HttpUrl;

public class PlayerStatusQuery extends Query {
    private String username;
    private UUID uuid;

    protected PlayerStatusQuery(String username) {
        this.username = username;
    }

    protected PlayerStatusQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        if(uuid != null ) {
            return HttpUrl.get(Endpoint.PLAYER_STATUS.getURL()).newBuilder()
                .addQueryParameter("uuid", uuid.toString());
        }
        return HttpUrl.get(Endpoint.PLAYER_STATUS.getURL()).newBuilder()
            .addQueryParameter("name", username);
    }

    public String getUsername() {
        return username;
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        PlayerStatusQuery other = (PlayerStatusQuery) o;

        if (o == this) {
            return true;
        }

        if(uuid != null) {
            return other.getUUID().equals(uuid);
        }

        return other.getUsername().equals(username);
    }
}
