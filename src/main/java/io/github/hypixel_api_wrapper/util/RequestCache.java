package io.github.hypixel_api_wrapper.util;

import java.util.HashMap;
import org.json.JSONObject;

public class RequestCache {
    private static HashMap<String, JSONObject> cache = new HashMap<>();
    public static void addRequest(String name, JSONObject obj) {
        cache.put(name, obj);
    }
    public static JSONObject getFromCache(String name) {
        return cache.get(name);
    }
    public static HashMap<String, JSONObject> getCache() {
        return cache;
    }
}
