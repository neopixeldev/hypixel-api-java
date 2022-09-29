package io.github.neopixel.http;

import io.github.neopixel.exception.NeopixelException;
import io.github.neopixel.http.cache.CachingStrategy;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.io.IOException;
import java.util.UUID;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class RequestFactory {

    private final CachingStrategy cache;
    private final String apiKey;
    private final OkHttpClient client = new OkHttpClient();

    protected RequestFactory(UUID apiKey, CachingStrategy cache) {
        this.apiKey = apiKey.toString();
        this.cache = cache;
    }


    /**
     * Sends a request to the Hypixel API. Returns a {@link JSONObject} of the information
     * retrieved.
     *
     * @param requestBuilder A {@link Request.Builder} with the base <code>URL</code> and parameters
     *                       already set.
     * @return A {@link JSONObject} of the information retrieved.
     */
    public JSONHandler send(HttpUrl.Builder requestBuilder) {

        requestBuilder.addQueryParameter("key", apiKey);

        Request request = new Request.Builder()
            .url(requestBuilder.build().toString())
            .build();

        try (Response response = client.newCall(request).execute()) {
            JSONObject returnObject = new JSONObject(response.body().string());
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
