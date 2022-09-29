package io.github.neopixel.http.query;

import io.github.neopixel.http.Endpoint;
import java.util.UUID;
import okhttp3.HttpUrl;

public class GuildQuery extends Query {
    private String name;
    private UUID uuid;

    protected GuildQuery(String name) {
        this.name = name;
    }

    protected GuildQuery(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        if(uuid != null ) {
            return HttpUrl.get(Endpoint.GUILD.getURL()).newBuilder()
                .addQueryParameter("uuid", uuid.toString());
        }
        return HttpUrl.get(Endpoint.GUILD.getURL()).newBuilder()
            .addQueryParameter("name", name);
    }

    public String getName() {
        return name;
    }

    public UUID getUUID() {
        return uuid;
    }

    @Override
    public boolean equals(Object o) {
        GuildQuery other = (GuildQuery) o;

        if(uuid != null) {
            return other.getUUID().equals(uuid);
        }

        return other.getName().equals(name);
    }
}
