package io.github.hypixel_api_wrapper.http.query;

import io.github.hypixel_api_wrapper.http.Endpoint;
import okhttp3.HttpUrl;

public class PlayerByUsernameQuery extends Query {

    private final String username;

    protected PlayerByUsernameQuery(String username) {
        this.username = username;
    }

    @Override
    public HttpUrl.Builder createRequest() {
        return HttpUrl.get(Endpoint.PLAYER.getURL()).newBuilder()
            .addQueryParameter("name", username);
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        PlayerByUsernameQuery other = (PlayerByUsernameQuery) o;

        if (o == this) {
            return true;
        }

        return other.getUsername().equals(username);
    }
}
