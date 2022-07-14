package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.util.Endpoint;
import io.github.hypixel_api_wrapper.wrapper.guild.HypixelGuild;
import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;
import io.github.hypixel_api_wrapper.wrapper.util.LevelUtil;
import java.util.Set;
import org.json.JSONObject;

public class HypixelPlayer {

    private final String username;
    private final RequestFactory requestFactory;
    JSONObject playerNetworkStats;

    public HypixelPlayer(String username, RequestFactory requestFactory) {
        this.username = username;
        this.requestFactory = requestFactory;
        this.playerNetworkStats = requestFactory.getEndpointThroughAPI(Endpoint.PLAYER);
    }

    public String getUsername() {
        return username;
    }

    public String getUUID() {
        return playerNetworkStats.getString("uuid");
    }

    public int getNetworkLevel() {
        return LevelUtil.getFullNetworkLevel(playerNetworkStats.getInt("networkExp"));
    }

    public int getNetworkEXP() {
        return playerNetworkStats.getInt("networkExp");
    }

    public int getNetworkKarma() {
        return playerNetworkStats.getInt("karma");
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public int getNetworkLevelPercentage() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public int getExpPastLastEventLevel() {
        return LevelUtil.getExpPastLastEventLevel(playerNetworkStats.getInt("networkExp"));
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public double getExpUntilNextEventLevel() {
        return LevelUtil.getExpUntilNextEventLevel(playerNetworkStats.getInt("networkExp"));
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
    public Set<HypixelFriend> getHypixelFriends(int limit) {
        throw new UnsupportedOperationException();
    }

    public Set<HypixelFriend> getHypixelFriends() {
        throw new UnsupportedOperationException();
    }

    //TODO check if this is actually the correct JSON
    public boolean isOnline() {
        return requestFactory.getEndpointThroughAPI(Endpoint.PLAYER_STATUS).getBoolean("status.online");
    }

    public int getTotalDailyRewardsClaimed() {
        return playerNetworkStats.getInt("totalDailyRewards");
    }

    public int getTopDailyRewardStreak() {
        return playerNetworkStats.getInt("rewardHighScore");
    }

    public int getCurrentDailyRewardStreak() {
        return playerNetworkStats.getInt("rewardStreak");
    }

    public HypixelRank getHypixelRank() {
        return HypixelRank.valueOf(playerNetworkStats.getString("newPackageRank"));
    }

    public HypixelColors getHypixelRankPlusColor() {
        return HypixelColors.valueOf(playerNetworkStats.getString("rankPlusColor"));
    }

    public HypixelGuild getGuild() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param level The level being tested if it's reward has been claimed.
     * @return A boolean stating whether if a Players leveling rewards has been claimed.
     */
    public boolean isLevelingRewardClaimed(int level) {
        return playerNetworkStats.getBoolean("levelingReward_" + level);
    }

    public String getUserLanguage() {
        return playerNetworkStats.getString("userLanguage");
    }

}
