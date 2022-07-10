package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.wrapper.guild.HypixelGuild;
import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;
import java.util.Set;

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


    /**
     * Meant for future usage; int limit is used to limit the amount of friends required to be
     * parsed from the api i.e., if called with #getFriends(100), only the first 100 friends would
     * be returned via this method
     *
     * @param limit The limit of the amount of friends that should be retrieved from the users
     *              friend list.
     * @return A Set of {@link HypixelFriend}'s that represent a given amount of
     * {@link HypixelPlayer}'s on the users friend list.
     */
    public Set<HypixelFriend> getFriends(int limit) {
        throw new UnsupportedOperationException();
    }

    public Set<HypixelFriend> getFriends() {
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
