package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.wrapper.guild.HypixelGuild;
import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;
import java.util.List;

public class HypixelPlayer {

    private String username;
    private String apiKey;

    public HypixelPlayer(String username, String apiKey) {
        this.username = username;
        this.apiKey = apiKey;
    }

    public String getUsername() {
        return username;
    }

    public String getUUID() {
        throw new UnsupportedOperationException();
    }

    public double getNetworkLevel() {
        throw new UnsupportedOperationException();
    }

    public double getNetworkEXP() {
        throw new UnsupportedOperationException();
    }

    public int getNetworkKarma() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public double getNetworkLevelPercentage() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public double getEXPIntoCurrentNetworkLevel() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public double getEXPToNextNetworkLevel() {
        throw new UnsupportedOperationException();
    }

    public List<HypixelFriend> getHypixelFriends() {
        throw new UnsupportedOperationException();
    }
    public boolean isOnline() {
        throw new UnsupportedOperationException();
    }

    public int getTotalDailyRewardsClaimed() {
        throw new UnsupportedOperationException();
    }

    public int getTopDailyRewardStreak() {
        throw new UnsupportedOperationException();
    }

    public int getCurrentDailyRewardStreak() {
        throw new UnsupportedOperationException();
    }

    public HypixelRank getHypixelRank() {
        throw new UnsupportedOperationException();
    }

    public HypixelColors getHypixelRankPlusColor() {
        throw new UnsupportedOperationException();
    }

    public HypixelGuild getGuild() {
        throw new UnsupportedOperationException();
    }

}
