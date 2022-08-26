package io.github.hypixel_api_wrapper.http.query;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.util.UUID;
import okhttp3.HttpUrl;

public class PlayerQuery extends Query {

    private String username;
    private UUID uuid;

    protected PlayerQuery(String username) {
        this.username = username;
    }

    protected PlayerQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        if(uuid != null ) {
            return HttpUrl.get(Endpoint.PLAYER.getURL()).newBuilder()
                .addQueryParameter("uuid", uuid.toString());
        }
        return HttpUrl.get(Endpoint.PLAYER.getURL()).newBuilder()
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
        PlayerQuery other = (PlayerQuery) o;

        if (o == this) {
            return true;
        }

        if(uuid != null) {
            return other.getUUID().equals(uuid);
        }

        return other.getUsername().equals(username);
    }
}
