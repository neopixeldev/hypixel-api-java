package io.github.neopixel.http;

import io.github.neopixel.exception.NeopixelException;
import io.github.neopixel.http.cache.CacheInterceptor;
import io.github.neopixel.http.query.Query;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class RequestFactory {
    private final String apiKey;
    private final OkHttpClient client;

    protected RequestFactory(UUID apiKey) {
        this.apiKey = apiKey.toString();
        this.client = new OkHttpClient();
    }

    protected RequestFactory(UUID apiKey, Cache cache) {
        this.apiKey = apiKey.toString();
        this.client = new OkHttpClient.Builder()
            .addNetworkInterceptor(new CacheInterceptor())
            .cache(cache)
            .build();
    }


    /**
     * Sends a request to the Hypixel API. Returns a {@link JSONObject} of the information
     * retrieved.
     *
     * @param query A {@link Query} with a {@link Request.Builder} with the base <code>URL</code> and parameters
     *                       already set.
     * @return A {@link JSONObject} of the information retrieved.
     */
    public JSONHandler send(Query query) {

        Request request = new Request.Builder()
            .url(query.createRequest().addQueryParameter("key", apiKey).build().toString())
            .build();

        try (Response response = client.newCall(request).execute()) {
            JSONObject returnObject = new JSONObject(Objects.requireNonNull(response.body()).string());
            if (RequestValidator.isValid(response, returnObject)) {
                return new JSONHandler(returnObject);
            } else {
                throw new NeopixelException("Fatal error, invalid response not caught.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
