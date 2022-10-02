package io.github.neopixel.wrapper.player;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.guild.HypixelGuild;
import io.github.neopixel.wrapper.guild.HypixelGuildMember;
import io.github.neopixel.wrapper.util.HypixelColors;
import io.github.neopixel.wrapper.util.JSONHandler;
import io.github.neopixel.wrapper.util.LevelUtil;
import io.github.neopixel.wrapper.util.UnformattedStringToUUID;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public class HypixelPlayer {

    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public HypixelPlayer(String username, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getPlayerByUsername(username).getJSONHandler("player");
    }

    public HypixelPlayer(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getPlayerByUUID(uuid).getJSONHandler("player");
    }

    public String getUsername() {
        return jsonHandler.getSafeString("displayname");
    }

    public UUID getUUID() {
        return jsonHandler.getSafeUUID("uuid");
    }

    public int getNetworkLevel() {
        return LevelUtil.getFullNetworkLevel(jsonHandler.getSafeLong("networkExp"));
    }

    public double getNetworkEXP() {
        return jsonHandler.getSafeDouble("networkExp");
    }

    public int getNetworkKarma() {
        return jsonHandler.getSafeInt("karma");
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public long getNetworkLevelPercentage() {
        return LevelUtil.getProgressExp(jsonHandler.getSafeLong("networkExp"));
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public int getEXPIntoCurrentNetworkLevel() {
        return LevelUtil.getExpPastLastEventLevel(jsonHandler.getSafeLong("networkExp"));
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public int getEXPToNextNetworkLevel() {
        return LevelUtil.getExpUntilNextEventLevel(jsonHandler.getSafeLong("networkExp"));
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
        JSONArray friendsRecords = requestController.getPlayerFriendsByUUID(getUUID())
            .getSafeJSONArray("records");
        Set<HypixelFriend> hypixelFriends = new HashSet<>();

        friendsRecords.toList().stream().limit(limit).forEach(friendObject -> {
            JSONObject friendJSONObject = (JSONObject) friendObject;
            HypixelFriend hypixelFriend;
            if (UUID.fromString(friendJSONObject.getString("uuidSender")).equals(getUUID())) {
                hypixelFriend = new HypixelFriend(
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    Instant.ofEpochSecond(friendJSONObject.getLong("started")), requestController);
            } else {
                hypixelFriend = new HypixelFriend(
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    Instant.ofEpochSecond(friendJSONObject.getLong("started")), requestController);
            }
            hypixelFriends.add(hypixelFriend);
        });

        return hypixelFriends;
    }

    public Set<HypixelFriend> getHypixelFriends() {
        JSONArray friendsRecords =
            requestController.getPlayerFriendsByUUID(getUUID()).getSafeJSONArray("records");
        Set<HypixelFriend> hypixelFriends = new HashSet<>();
        friendsRecords.forEach(friendObject -> {
            JSONObject friendJSONObject = (JSONObject) friendObject;
            HypixelFriend hypixelFriend;
            if (UnformattedStringToUUID.convertUnformattedStringToUUID(friendJSONObject.getString("uuidSender")).equals(getUUID())) {
                hypixelFriend = new HypixelFriend(
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    Instant.ofEpochSecond(friendJSONObject.getLong("started")), requestController);
            } else {
                hypixelFriend = new HypixelFriend(
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidSender")),
                    UnformattedStringToUUID.convertUnformattedStringToUUID(
                        friendJSONObject.getString("uuidReceiver")),
                    Instant.ofEpochSecond(friendJSONObject.getLong("started")), requestController);
            }
            hypixelFriends.add(hypixelFriend);
        });

        return hypixelFriends;
    }

    public boolean isOnline() {
        return requestController.getPlayerStatusByUsername(getUsername()).getJSONHandler("session")
            .getSafeBoolean("online");
    }

    public int getTotalDailyRewardsClaimed() {
        return jsonHandler.getSafeInt("totalDailyRewards");
    }

    public int getTopDailyRewardStreak() {
        return jsonHandler.getSafeInt("rewardHighScore");
    }

    public int getCurrentDailyRewardStreak() {
        return jsonHandler.getSafeInt("rewardStreak");
    }

    public HypixelRank getHypixelRank() {
        return HypixelRank.valueOf(jsonHandler.getSafeString("newPackageRank"));
    }

    public HypixelColors getHypixelRankPlusColor() {
        return HypixelColors.valueOf(jsonHandler.getSafeString("rankPlusColor"));
    }

    public Optional<HypixelGuildMember> asGuildMember() {
        return getGuild().getMemberByUUID(getUUID());
    }

    public HypixelGuild getGuild() {
        return new HypixelGuild(getUUID(), requestController);
    }

    public HypixelPlayerGames getGames() {
        return new HypixelPlayerGames(jsonHandler.getJSONHandler("stats"));
    }
}