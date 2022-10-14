package io.github.neopixel.wrapper.util;

import java.util.Enumeration;
import java.util.Iterator;
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
            Object object = this.get(key);
            if (object instanceof JSONArray) {
                return (JSONArray) object;
            }
        }
            return null;
    }

    public String getSafeString(String key) {
        if (stats.has(statsPrefix + key)) {
            Object object = this.get(key);
            if (object instanceof String) {
                return (String) object;
            }
        }
        return "";
    }

    public boolean getSafeBoolean(String key) {
        if (stats.has(statsPrefix + key)) {
            Object object = this.get(key);
            if (object.equals(Boolean.FALSE)
                || (object instanceof String && ((String) object)
                .equalsIgnoreCase("false"))) {
                return false;
            } else if (object.equals(Boolean.TRUE)
                || (object instanceof String && ((String) object)
                .equalsIgnoreCase("true"))) {
                return true;
            }
        }
        return false;
    }


    public int getSafeInt(String key) {
        if (stats.has(statsPrefix + key)) {
            final Object object = this.get(key);
            if (object instanceof Number) {
                return ((Number) object).intValue();
            }
            try {
                return Integer.parseInt(object.toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public double getSafeDouble(String key) {
        if (stats.has(statsPrefix + key)) {
            final Object object = this.get(key);
            if (object instanceof Number) {
                return ((Number) object).doubleValue();
            }
            try {
                return Double.parseDouble(object.toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public long getSafeLong(String key) {
        if (stats.has(statsPrefix + key)) {
            final Object object = this.get(key);
            if (object instanceof Number) {
                return ((Number) object).longValue();
            }
            try {
                return Long.parseLong(object.toString());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public UUID getSafeUUID(String key) {
        if (stats.has(statsPrefix + key)) {
            return UnformattedStringToUUID.convertUnformattedStringToUUID(
                getSafeString(key));
        } else {
            return null;
        }
    }

    public Object get(String key) {
        return stats.get(statsPrefix + key);
    }

    public Iterator<String> getKeys() {
        return stats.keys();
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
