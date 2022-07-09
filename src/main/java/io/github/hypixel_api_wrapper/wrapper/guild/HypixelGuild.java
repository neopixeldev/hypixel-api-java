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
        return 0;
    }
    public double getExperience() {
        return 0;
    }
    public List<HypixelPlayer> getMembers() {
        return null;
    }
    public HypixelPlayer getOwner() {
        return null;
    }
    public long getDailyGEXP() {
        return 0;
    }
    public boolean isPubliclyListed() {
        return false;
    }
    public String getDescription() {
        return null;
    }
    public boolean isJoinable() {
        return false;
    }
    public int getCoins() {
        return 0;
    }
    public String getTag() {
        return null;
    }
    public int getPlacementOnLeaderboard() {
        return 0;
    }

}
