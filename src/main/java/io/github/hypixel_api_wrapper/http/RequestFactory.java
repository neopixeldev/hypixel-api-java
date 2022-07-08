package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.util.Endpoint;
import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RequestFactory implements Closeable {

    private final CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
    private final BasicResponseHandler handler = new BasicResponseHandler();
    private final ExecutorService threadPool = Executors.newCachedThreadPool();
    private final String apiKey;

    public RequestFactory(UUID apiKey) {
        if (apiKey == null) {
            throw new IllegalArgumentException("Hypixel API key cannot be null");
        }
        this.apiKey = apiKey.toString();
    }

    @Override
    public void close() throws IOException {
        if (!client.isRunning()) {
            throw new IllegalStateException("RequestFactory is already not running");
        }
        client.close();
    }

    /**
     * Sends a request to the Hypixel API. Returns a {@link JSONObject} of the information
     * retrieved.
     *
     * @param uri The API URL of the information that is being retrieved.
     * @return A {@link JSONObject} of the information retrieved.
     */
    public CompletableFuture<JSONObject> send(URI uri) {
        if (!client.isRunning()) {
            client.start();
        }

        Future<HttpResponse> pendingResponse = client.execute(RequestBuilder.get(uri)
            .addHeader("API-Key", apiKey)
            .addHeader("Accept", "application/json")
            .build(), /* callback = */ null);

        return CompletableFuture.supplyAsync(() -> {
            try {
                // TODO: 7/8/22 Make timeout configurable.
                HttpResponse response = pendingResponse.get(1_500, TimeUnit.MILLISECONDS);
                JSONObject responseBody = new JSONObject(handler.handleResponse(response));
                // Release the underlying provider for the response's body.
                EntityUtils.consume(response.getEntity());
                return responseBody;
            } catch (InterruptedException | ExecutionException | IOException | TimeoutException e) {
                // TODO: 7/8/22 Wrap these in our own exception class.
                throw new RuntimeException(e);
            }
        }, threadPool);
    }

    /**
     * Retrieve information from the Hypixel API.
     *
     * @param endpoint     The API URL of the information that is being retrieved.
     * @param dataLocation The specific piece of data in the JSON file will be retrieved.
     * @return A piece of specified data from the retrieved JSON file.
     */
    public CompletableFuture<String> getInformation(Endpoint endpoint, String dataLocation) {
        return send(endpoint.getURI()).thenApply(body -> body.get(dataLocation).toString());
    }
}
