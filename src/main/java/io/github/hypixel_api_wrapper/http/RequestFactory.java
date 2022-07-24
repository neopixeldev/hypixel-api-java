package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import java.io.IOException;
import java.util.UUID;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class RequestFactory {

    private CachingStrategy cache;
    private final String apiKey;
    private final OkHttpClient client = new OkHttpClient();

    public RequestFactory(UUID apiKey, CachingStrategy cache) {
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
    public JSONObject send(HttpUrl.Builder requestBuilder) {

        final JSONObject[] res = new JSONObject[1];

        requestBuilder.addQueryParameter("key", apiKey);

        Request request = new Request.Builder()
            .url(requestBuilder.build().toString())
            .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            public void onResponse(Call call, Response response)
                throws IOException {
                res[0] = new JSONObject(response.body().toString());
            }

            public void onFailure(Call call, IOException e) {
                // TODO failure
            }
        });
        return res[0];
    }
}
