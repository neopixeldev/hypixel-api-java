package io.github.hypixel_api_wrapper.wrapper.player;

import io.github.hypixel_api_wrapper.http.Endpoint;
import io.github.hypixel_api_wrapper.http.RequestController;
import io.github.hypixel_api_wrapper.http.RequestFactory;
import io.github.hypixel_api_wrapper.wrapper.games.bedwars.HypixelBedWarsStats;
import io.github.hypixel_api_wrapper.wrapper.guild.HypixelGuild;
import io.github.hypixel_api_wrapper.wrapper.util.HypixelColors;
import io.github.hypixel_api_wrapper.wrapper.util.LevelUtil;
import java.util.Optional;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class HypixelPlayer {

    private final RequestController requestController;
    private HypixelPlayerGames games;
    private final JSONObject playerStats;

    public HypixelPlayer(String username, RequestController requestController) {
        this.requestController = requestController;
        this.playerStats = requestController.getPlayer(username).getJSONObject("player");
    }

    public String getUsername() {
        return playerStats.getString("displayName");
    }

    public String getUUID() {
        return playerStats.getString("uuid");
    }

    public int getNetworkLevel() {
        return LevelUtil.getFullNetworkLevel(playerStats.getInt("networkExp"));
    }

    public double getNetworkEXP() {
        return playerStats.getInt("networkExp");
    }

    public int getNetworkKarma() {
        return playerStats.getInt("karma");
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public double getNetworkLevelPercentage() {
        return LevelUtil.getProgressExp(playerStats.getInt("networkExp"));
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public double getEXPIntoCurrentNetworkLevel() {
        return LevelUtil.getExpPastLastEventLevel(playerStats.getInt("networkExp"));
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public double getEXPToNextNetworkLevel() {
        return LevelUtil.getExpUntilNextEventLevel(playerStats.getInt("networkExp"));
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

    public boolean isOnline() {
        return requestController.getPlayerStatus(username).getJSONObject("session").getBoolean("online");
    }

    public int getTotalDailyRewardsClaimed() {
        return playerStats.getInt("totalDailyRewards");
    }

    public int getTopDailyRewardStreak() {
        return playerStats.getInt("rewardHighScore");
    }

    public int getCurrentDailyRewardStreak() {
        return playerStats.getInt("rewardStreak");
    }

    public HypixelRank getHypixelRank() {
        return HypixelRank.valueOf(playerStats.getString("newPackageRank"));
    }

    public HypixelColors getHypixelRankPlusColor() {
        return HypixelColors.valueOf(playerStats.getString("rankPlusColor"));
    }

    public HypixelGuild getGuild() {
        return new HypixelGuild(getUUID(), requestController);
    }

    public HypixelPlayerGames getGames() {
        return Optional.ofNullable(games).orElse(games = new HypixelPlayerGames(playerStats.getJSONObject("stats")));
    }
}