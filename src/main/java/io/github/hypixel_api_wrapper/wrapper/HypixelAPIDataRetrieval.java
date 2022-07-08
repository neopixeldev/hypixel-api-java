package io.github.hypixel_api_wrapper.wrapper;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import org.json.JSONObject;

public class HypixelAPIDataRetrieval <E> {
    public E getInformation(String endpoint, String dataLocation) {
        JSONObject object = RequestFactory.send(endpoint);
        return (E) object.get(dataLocation);
    }
}
