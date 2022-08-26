package io.github.hypixel_api_wrapper.http.query;

import io.github.hypixel_api_wrapper.http.Endpoint;
import java.util.UUID;
import okhttp3.HttpUrl;

public class PlayerStatusByUUIDQuery extends Query {
    private final UUID uuid;

    protected PlayerStatusByUUIDQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        return HttpUrl.get(Endpoint.PLAYER_STATUS.getURL()).newBuilder()
            .addQueryParameter("uuid", uuid.toString());
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        PlayerStatusByUUIDQuery other = (PlayerStatusByUUIDQuery) o;

        if (o == this) {
            return true;
        }

        return other.getUUID().equals(uuid);
    }

}
