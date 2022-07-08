package io.github.hypixel_api_wrapper.wrapper;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.util.Endpoint;
import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class HypixelAPIDataRetrieval<E> implements Closeable {

    private final RequestFactory requestFactory;

    public HypixelAPIDataRetrieval(UUID apiKey) {
        this.requestFactory = new RequestFactory(apiKey);
    }

    public CompletableFuture<E> getInformation(Endpoint endpoint, String dataLocation) {
        return requestFactory
            .send(endpoint.getURI())
            .thenApply(body -> (E) body.get(dataLocation));
    }

    @Override
    public void close() throws IOException {
        requestFactory.close();
    }
}
