package io.github.neopixel.wrapper.skyblock.player.upgrade;

import io.github.neopixel.wrapper.util.JSONHandler;

public class CommunityUpgradeState {

    private final JSONHandler jsonHandler;

    public CommunityUpgradeState(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public String getUpgrade() {
        return jsonHandler.getSafeString("upgrade");
    }

    public Integer getTier() {
        return jsonHandler.getSafeInt("tier");
    }

    public Long getStartedAt() {
        return jsonHandler.getSafeLong("started_ms");
    }

    public String getWhoStarted() {
        return jsonHandler.getSafeString("started_by");
    }

    public Long getClaimedAt() {
        return jsonHandler.getSafeLong("claims_ms");
    }

    public String getWhoClaimed() {
        return jsonHandler.getSafeString("claimed_by");
    }

    public Boolean wasFastTracked() {
        return jsonHandler.getSafeBoolean("fasttracked");
    }
}