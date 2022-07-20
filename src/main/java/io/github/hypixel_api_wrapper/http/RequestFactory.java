package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.http.cache.CachingStrategy;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RequestFactory {

    private static CloseableHttpAsyncClient client;
    private static BasicResponseHandler handler;
    private static CachingStrategy cache;
    private final String apiKey;

    public RequestFactory(UUID apiKey) {
        this.apiKey = apiKey.toString();
    }

    public void start(CachingStrategy cachingStrategy) {
        if (!client.isRunning()) {
            client = HttpAsyncClients.createDefault();
            handler = new BasicResponseHandler();
            cache = cachingStrategy;

            client.start();
        }
    }

    public void close() throws IOException {
        if (client.isRunning()) {
            client.close();
            cache.clearCache();
        }
    }

    /**
     * Sends a request to the Hypixel API. Returns a {@link JSONObject} of the information
     * retrieved.
     *
     * @param endpoint The API URL of the information that is being retrieved.
     * @return A {@link JSONObject} of the information retrieved.
     */
    public JSONObject send(Endpoint endpoint) {
        try {
            HttpUriRequest request = RequestBuilder.get(endpoint.getURL().toURI())
                .addHeader("API-key", apiKey)
                .build();
            // TODO implement a CompletableFuture workaround
            Future<HttpResponse> future = client.execute(request, null);
            HttpResponse response = future.get(500, TimeUnit.MILLISECONDS);
            JSONObject res = new JSONObject(handler.handleResponse(response));
            EntityUtils.consume(response.getEntity());
            return res;
        } catch (InterruptedException | ExecutionException | IOException | TimeoutException e) {
            // TODO create own error to handle these exceptions
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This method's use is the exact same as #send, but it adds requests to the cache.
     */
    public JSONObject getEndpointThroughAPI(Endpoint endpoint) {
        if (cache.isCacheValid(endpoint)) {
            return cache.getCachedResponse(endpoint);
        }

        JSONObject res = send(endpoint);
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
    public String getInformation(Endpoint endpoint, String dataLocation) {
        return send(endpoint).get(dataLocation).toString();
    }
}
