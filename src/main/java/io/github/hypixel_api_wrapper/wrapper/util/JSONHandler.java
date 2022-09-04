package io.github.hypixel_api_wrapper.wrapper.util;

import java.util.Optional;
import java.util.UUID;
import org.json.JSONObject;

public class JSONHandler {

    private final JSONObject stats;
    private String statsPrefix;


    public JSONHandler(JSONObject stats) {
        this.stats = stats;
        this.statsPrefix = "";
    }

    public JSONHandler(JSONObject stats, String statsPrefix) {
        this.stats = stats;
        this.statsPrefix = statsPrefix;
    }

    public Optional<String> getSafeString(String key) {
            return Optional.ofNullable(stats.getString(statsPrefix + key));
    }

    public Optional<Integer> getSafeInt(String key) {
        return Optional.ofNullable(stats.getInt(statsPrefix + key));
    }

    public Optional<Double> getSafeDouble(String key) {
        return Optional.ofNullable(stats.getDouble(statsPrefix + key));
    }

    public Optional<Long> getSafeLong(String key) {
        return Optional.ofNullable(stats.getLong(statsPrefix + key));
    }

    public Optional<UUID> getSafeUUID(String key) {
        return Optional.ofNullable(UnformattedStringToUUID.convertUnformattedStringToUUID(stats.getString(statsPrefix + key)));
    }

    public JSONObject getJSONObject(String key) {
        return stats.getJSONObject(key);
    }

}
