package io.github.neopixel.wrapper.player;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.guild.HypixelGuild;
import io.github.neopixel.wrapper.util.HypixelColors;
import io.github.neopixel.wrapper.util.JSONHandler;
import io.github.neopixel.wrapper.util.LevelUtil;
import io.github.neopixel.wrapper.util.UnformattedStringToUUID;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
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
        this.jsonHandler = new JSONHandler(requestController.getPlayer(username).getJSONObject("player"));
    }

    public HypixelPlayer(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = new JSONHandler(requestController.getPlayer(uuid).getJSONObject("player"));
    }

    public Optional<String> getUsername() {
        return jsonHandler.getSafeString("displayname");
    }

    public Optional<UUID> getUUID() {
        return jsonHandler.getSafeUUID("uuid");
    }

    public Optional<Integer> getNetworkLevel() {
        return Optional.of(LevelUtil.getFullNetworkLevel(jsonHandler.getSafeLong("networkExp").get()));
    }

    public Optional<Double> getNetworkEXP() {
        return jsonHandler.getSafeDouble("networkExp");
    }

    public Optional<Integer> getNetworkKarma() {
        return jsonHandler.getSafeInt("karma");
    }

    /**
     * @return A double representing the percentage of how far a HypixelPlayer is through their
     * current Network Level.
     */
    public Optional<Long> getNetworkLevelPercentage() {
        return Optional.ofNullable(LevelUtil.getProgressExp(jsonHandler.getSafeLong("networkExp").get()));
    }

    /**
     * @return A double representing the amount of EXP the HypixelPlayer has progressed into their
     * current Network Level.
     */
    public Optional<Integer> getEXPIntoCurrentNetworkLevel() {
        return Optional.ofNullable(LevelUtil.getExpPastLastEventLevel(jsonHandler.getSafeLong("networkExp").get()));
    }

    /**
     * @return A double representing how much EXP is required to the next level.
     */
    public Optional<Integer> getEXPToNextNetworkLevel() {
        return Optional.ofNullable(
            LevelUtil.getExpUntilNextEventLevel(jsonHandler.getSafeLong("networkExp").get()));
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
        JSONArray friendsRecords = requestController.getPlayerFriends(getUUID().get())
            .getJSONArray("records");
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
            requestController.getPlayerFriends(getUUID().get()).getJSONArray("records");
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
        return requestController.getPlayerStatus(getUsername().get()).getJSONObject("session")
            .getBoolean("online");
    }

    public Optional<Integer> getTotalDailyRewardsClaimed() {
        return jsonHandler.getSafeInt("totalDailyRewards");
    }

    public Optional<Integer> getTopDailyRewardStreak() {
        return jsonHandler.getSafeInt("rewardHighScore");
    }

    public Optional<Integer> getCurrentDailyRewardStreak() {
        return jsonHandler.getSafeInt("rewardStreak");
    }

    public Optional<Instant> getLastClaimedRewardTime() {
        return Optional.ofNullable(Instant.ofEpochSecond(jsonHandler.getSafeLong("lastClaimedReward").get()));
    }

    public Optional<HypixelRank> getHypixelRank() {
        return Optional.ofNullable(
            HypixelRank.valueOf(jsonHandler.getSafeString("newPackageRank").get()));
    }

    public Optional<HypixelColors> getHypixelRankPlusColor() {
        return Optional.ofNullable(HypixelColors.valueOf(jsonHandler.getSafeString("rankPlusColor").get()));
    }

    public Optional<Instant> getLastLogin() {
        return Optional.ofNullable(Instant.ofEpochSecond(jsonHandler.getSafeLong("lastLogin").get()));
    }

    public Optional<Instant> getFirstLogin() {
        return Optional.ofNullable(Instant.ofEpochSecond(jsonHandler.getSafeLong("firstLogin").get()));
    }

    public Optional<Instant> getLastLogout() {
        return Optional.ofNullable(Instant.ofEpochSecond(jsonHandler.getSafeLong("lastLogout").get()));
    }

    public HypixelGuild getGuild() {
        return new HypixelGuild(getUUID().get(), requestController);
    }

    public HypixelPlayerGames getGames() {
        return new HypixelPlayerGames(jsonHandler.getJSONHandler("stats").get());
    }

    public Optional<String> getUserLanguage() {
        return jsonHandler.getSafeString("userLanguage");
    }

    public Optional<String> getYoutubeLink() {
        return jsonHandler.getJSONHandler("socialMedia").get().getJSONHandler("links").get().getSafeString("YOUTUBE");
    }

    public Optional<String> getTwitterLink() {
        return jsonHandler.getJSONHandler("socialMedia").get().getJSONHandler("links").get().getSafeString("TWITTER");
    }

    public Optional<String> getDiscordTag() {
        return jsonHandler.getJSONHandler("socialMedia").get().getJSONHandler("links").get().getSafeString("DISCORD");
    }
}