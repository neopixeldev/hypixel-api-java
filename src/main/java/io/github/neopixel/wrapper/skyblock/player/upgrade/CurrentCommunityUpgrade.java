package io.github.neopixel.wrapper.skyblock.player.upgrade;

import io.github.neopixel.wrapper.util.JSONHandler;

public class CurrentCommunityUpgrade {

    private final JSONHandler jsonHandler;

    public CurrentCommunityUpgrade(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    // Ex. coins_allowance
    public String getUpgrade() {
        return jsonHandler.getSafeString("upgrade");
    }

    public Integer getNewTier() {
        return jsonHandler.getSafeInt("new_tier");
    }

    public Long getStartedAt() {
        return jsonHandler.getSafeLong("start_ms");
    }

    // TODO: i think this is a string: f953226a544a4697bfd5a07d4e7165ad not a UUID
    public String getWhoStarted() {
        return jsonHandler.getSafeString("who_started");
    }
}