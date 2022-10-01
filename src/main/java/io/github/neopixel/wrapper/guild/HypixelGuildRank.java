package io.github.neopixel.wrapper.guild;

import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Instant;
import org.json.JSONObject;

public class HypixelGuildRank {

    private final JSONHandler jsonHandler;

    public HypixelGuildRank(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    public boolean isDefault() {
        return jsonHandler.getSafeBoolean("default");
    }

    public String getTag() {
        return jsonHandler.getSafeString("tag");
    }

    public Instant getDateCreated() {
        return Instant.ofEpochSecond(jsonHandler.getSafeLong("created"));
    }

    public int getPriority() {
        return jsonHandler.getSafeInt("priority");
    }
}
