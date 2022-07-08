package io.github.hypixel_api_wrapper.wrapper;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import java.io.Closeable;
import java.io.IOException;
import java.util.UUID;
import org.json.JSONObject;

public class HypixelAPIDataRetrieval<E> implements Closeable {

    private final RequestFactory requestFactory;

    public HypixelAPIDataRetrieval(UUID apiKey) {
        this.requestFactory = new RequestFactory(apiKey);
    }

    public E getInformation(String endpoint, String dataLocation) {
        JSONObject object = requestFactory.send(endpoint);
        return (E) object.get(dataLocation);
    }

    @Override
    public void close() throws IOException {
        requestFactory.close();
    }
}
