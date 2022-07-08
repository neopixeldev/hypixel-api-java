package io.github.hypixel_api_wrapper.http;

import org.apache.http.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.concurrent.*;
import org.json.JSONObject;

public class RequestFactory {
    private static final CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
    private static final BasicResponseHandler handler = new BasicResponseHandler();

    public static void start() {
        if (!client.isRunning()) {
            client.start();
        }
    }
    public static void close() throws IOException {
        if(client.isRunning()) {
            client.close();
        }
    }
    public static JSONObject send(String url) {
        try {
            client.start();
            HttpUriRequest request = RequestBuilder.create("GET")
                    .setUri(url)
                    .addHeader("content-type", "application/json")
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
        }
    }
}
