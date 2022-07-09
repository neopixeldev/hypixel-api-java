package io.github.hypixel_api_wrapper.wrapper.guild;

import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.util.List;

public class HypixelGuild {
    private String name;
    private String apiKey;

    public HypixelGuild(String name, String apiKey) {
        this.name = name;
        this.apiKey = apiKey;
    }
    public String getName() {
        return name;
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
