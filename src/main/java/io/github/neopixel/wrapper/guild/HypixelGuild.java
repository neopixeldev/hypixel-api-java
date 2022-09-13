package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

public class HypixelGuild {
    private final RequestController requestController;
    private final JSONObject guildStats;

    public HypixelGuild(String name, RequestController requestController) {
        this.requestController = requestController;
        this.guildStats = requestController.getGuild(name);
    }

    public HypixelGuild(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.guildStats = requestController.getGuild(uuid);
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public double getLevel() {
        throw new UnsupportedOperationException();
    }

    public double getExperience() {
        throw new UnsupportedOperationException();
    }

    public List<HypixelPlayer> getMembers() {
        throw new UnsupportedOperationException();
    }

    public HypixelPlayer getOwner() {
        throw new UnsupportedOperationException();
    }

    public long getDailyGEXP() {
        throw new UnsupportedOperationException();
    }

    public boolean isPubliclyListed() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isJoinable() {
        throw new UnsupportedOperationException();
    }

    public int getCoins() {
        throw new UnsupportedOperationException();
    }

    public String getTag() {
        throw new UnsupportedOperationException();
    }

    public int getPlacementOnLeaderboard() {
        throw new UnsupportedOperationException();
    }
}
