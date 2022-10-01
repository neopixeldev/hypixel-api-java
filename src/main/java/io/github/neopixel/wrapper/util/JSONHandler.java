package io.github.neopixel.wrapper.util;

import java.util.Optional;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONHandler {

    private final JSONObject stats;
    private final String statsPrefix;


    public JSONHandler(JSONObject stats) {
        this.stats = stats;
        this.statsPrefix = "";
    }

    public JSONHandler(JSONObject stats, String statsPrefix) {
        this.stats = stats;
        this.statsPrefix = statsPrefix;
    }

    public JSONArray getSafeJSONArray(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getJSONArray(statsPrefix + key);
        } else {
            return null;
        }
    }
    public String getSafeString(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getString(statsPrefix + key);
        } else {
            return null;
        }
    }

    public boolean getSafeBoolean(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getBoolean(statsPrefix + key);
        } else {
            return false;
        }
    }


    public int getSafeInt(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getInt(statsPrefix + key);
        } else {
            return 0;
        }
    }

    public double getSafeDouble(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getDouble(statsPrefix + key);
        } else {
            return 0;
        }
    }

    public long getSafeLong(String key) {
        if (stats.has(statsPrefix + key)) {
            return stats.getLong(statsPrefix + key);
        } else {
            return 0;
        }
    }

    public UUID getSafeUUID(String key) {
        if (stats.has(statsPrefix + key)) {
            return UnformattedStringToUUID.convertUnformattedStringToUUID(
                getSafeString(key));
        } else {
            return null;
        }

    }

    public JSONHandler getJSONHandler(String key) {
        if (stats.has(key)) {
            return new JSONHandler(stats.getJSONObject(key));
        } else {
            return null;
        }
    }

    public JSONHandler getThisJSONHandlerWithStatsPrefix(String statsPrefix) {
        return new JSONHandler(stats, statsPrefix);
    }
}
