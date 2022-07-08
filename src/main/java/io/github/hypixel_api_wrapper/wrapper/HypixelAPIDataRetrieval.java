package io.github.hypixelapiwrapper.wrapper;

import io.github.hypixelapiwrapper.http.RequestFactory;
import org.json.JSONObject;

public class HypixelAPIDataRetrieval <E> {
    public E getInformation(String endpoint, String dataLocation) {
        JSONObject object = RequestFactory.send(endpoint);
        return (E) object.get(dataLocation);
    }
}
