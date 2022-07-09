package io.github.hypixel_api_wrapper.util;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class RequestCache {
    private static Map<String, JSONObject> cache = new HashMap<>();
    public static void addRequest(String name, JSONObject obj) {
        cache.put(name, obj);
    }
    public static void clearCache() {
        cache.clear();
    }
    public static JSONObject getFromCache(String name) {
        return cache.get(name);
    }
    public static Map<String, JSONObject> getCache() {
        return cache;
    }
}
