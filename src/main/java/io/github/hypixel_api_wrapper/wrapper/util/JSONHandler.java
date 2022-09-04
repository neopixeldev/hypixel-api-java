package io.github.hypixel_api_wrapper.wrapper.util;

import java.util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONHandler {

    private final JSONObject stats;
    private String statsPrefix;


    public JSONHandler(JSONObject stats) {
        this.stats = stats;
    }

    public JSONHandler(JSONObject stats, String statsPrefix) {
        this.stats = stats;
        this.statsPrefix = statsPrefix;
    }

    public <T> Optional<T> getSafe(String key) {
            return (Optional<T>) Optional.ofNullable(stats.get(statsPrefix + key));
    }
}
