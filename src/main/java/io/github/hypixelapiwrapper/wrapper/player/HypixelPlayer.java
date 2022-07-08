package io.github.hypixelapiwrapper.wrapper.player;

import io.github.hypixelapiwrapper.wrapper.guild.Guild;
import java.util.List;

public class HypixelPlayer {

    private String username;
    private String APIKey;

    public HypixelPlayer(String username, String APIKey) {
        this.username = username;
        this.APIKey = APIKey;
    }

    public String getUsername() {
        return username;
    }

    public String getUUID() {
        return null;
    }

    public double getNetworkLevel() {
        return 0;
    }

    public double getNetworkEXP() {
        return 0;
    }

    public int getNetworkKarma() {
        return 0;
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public double getNetworkLevelPercentage() {
        return 0;
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public double getEXPIntoCurrentNetworkLevel() {
        return 0;
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public double getEXPToNextNetworkLevel() {
        return 0;
    }

    public List<HypixelPlayer> getHypixelFriends() {
        return null;
    }

    public boolean isOnline() {
        return false;
    }

    public int getTotalDailyRewardsClaimed() {
        return 0;
    }

    public int getTopDailyRewardStreak() {
        return 0;
    }

    public int getCurrentDailyRewardStreak() {
        return 0;
    }

    public HypixelRank getHypixelRank() {
        return HypixelRank.DEFAULT;
    }

    public HypixelRankPlusColor getHypixelRankPlusColor() {
        return null;
    }

    public Guild getGuild() {
        return null;
    }

}
