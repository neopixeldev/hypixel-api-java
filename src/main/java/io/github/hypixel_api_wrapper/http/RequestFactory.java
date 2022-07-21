package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RequestFactory {

    private static HttpClient client;
    private static CachingStrategy cache;

    public static void configure(CachingStrategy cache) {
        client = HttpClient.newBuilder().build();
        RequestFactory.cache = cache;
    }

    /**
     * Sends a request to the Hypixel API. Returns a {@link JSONObject} of the information
     * retrieved.
     *
     * @param url The API URL of the information that is being retrieved.
     * @return A {@link JSONObject} of the information retrieved.
     */
    public static CompletableFuture<JSONObject> send(String url) {
        try {
            return client.sendAsync(HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofMillis(2000))
                    .GET()
                    .build(), HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(JSONObject::new);
        } catch(Exception e) { // catching all forms of generic exceptions (unsure if this method throws any (it probably does))
            throw new RuntimeException(e);
        }
    }

    /**
     * This method's use is the exact same as #send, but it adds requests to the cache.
     */
    public static CompletableFuture<JSONObject> getEndpointThroughAPI(Endpoint endpoint) {
        if (cache.isCacheValid(endpoint)) {
            return cache.getCachedResponse(endpoint);
        }

        CompletableFuture<JSONObject> res = send(endpoint.toString());
        cache.cacheResponse(endpoint, res);
        return res;
    }

    /**
     * Retrieve information from the Hypixel API.
     *
     * @param endpoint     The API URL of the information that is being retrieved.
     * @param dataLocation The specific piece of data in the JSON file will be retrieved.
     * @return A piece of specified data from the retrieved JSON file.
     */
    public static String getInformation(Endpoint endpoint, String dataLocation) {
        return send(endpoint.toString()).thenApply(data -> data.get(dataLocation)).toString();
    }
}
