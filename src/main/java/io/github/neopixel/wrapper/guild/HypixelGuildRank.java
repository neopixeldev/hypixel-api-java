package io.github.neopixel.wrapper.guild;

import java.time.Instant;
import org.json.JSONObject;

public class HypixelGuildRank {

    private final JSONObject object;

    public HypixelGuildRank(JSONObject object) {
        this.object = object;
    }

    public String getName() {
        return object.getString("name");
    }

    public boolean isDefault() {
        return object.getBoolean("default");
    }

    public String getTag() {
        return object.getString("tag");
    }

    public Instant getDateCreated() {
        return Instant.ofEpochSecond(object.getLong("created"));
    }

    public int getPriority() {
        return object.getInt("priority");
    }
}
