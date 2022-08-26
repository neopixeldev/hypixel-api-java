package io.github.hypixel_api_wrapper.http.query;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.Request;

public class PlayerByUUIDQuery extends Query {

    private final UUID uuid;

    protected PlayerByUUIDQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        return HttpUrl.parse(Endpoint.PLAYER.getURL().toString()).newBuilder()
            .addQueryParameter("uuid", uuid.toString());
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        PlayerByUUIDQuery other = (PlayerByUUIDQuery) o;

        if (o == this) {
            return true;
        }

        return other.getUUID().equals(uuid);
    }
}
