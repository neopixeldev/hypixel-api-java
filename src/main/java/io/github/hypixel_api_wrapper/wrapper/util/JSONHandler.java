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
        if (stats.has(statsPrefix + key)) {
            return Optional.of(stats.getString(statsPrefix + key));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Integer> getSafeInt(String key) {
        if (stats.has(statsPrefix + key)) {
            return Optional.of(stats.getInt(statsPrefix + key));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Double> getSafeDouble(String key) {
        if (stats.has(statsPrefix + key)) {
            return Optional.of(stats.getDouble(statsPrefix + key));
        } else {
            return Optional.empty();
        }
    }

    public Optional<Long> getSafeLong(String key) {
        if (stats.has(statsPrefix + key)) {
            return Optional.of(stats.getLong(statsPrefix + key));
        } else {
            return Optional.empty();
        }
    }

    public Optional<UUID> getSafeUUID(String key) {
        if (stats.has(statsPrefix + key)) {
            return Optional.of(UnformattedStringToUUID.convertUnformattedStringToUUID(
                stats.getString(statsPrefix + key)));
        } else {
            return Optional.empty();
        }

    }

    public Optional<JSONObject> getJSONObject(String key) {
        if (stats.has(key)) {
            return Optional.of(stats.getJSONObject(key));
        } else {
            return Optional.empty();
        }
    }

    public JSONObject getStatsObject() {
        return stats;
    }

}
