package com.insertign.pineapple.http;

import com.spikhalskiy.futurity.Futurity;
import org.apache.http.*;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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
    public static String send(String url) throws ExecutionException, InterruptedException, IOException {
        client.start();
        HttpUriRequest request = RequestBuilder.create("GET")
                .setUri(url)
                .addHeader("content-type", "application/json")
                .build();
        // TODO implement a CompletableFuture workaround
        Future<HttpResponse> future = client.execute(request, null);
        HttpResponse response = future.get();
        String res = handler.handleResponse(response);
        EntityUtils.consume(response.getEntity());
        return res;
    }
}
