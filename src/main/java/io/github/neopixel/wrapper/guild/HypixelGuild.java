package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.util.GuildLevelingUtil;
import io.github.neopixel.wrapper.util.HypixelColors;
import io.github.neopixel.wrapper.util.HypixelGameTypes;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class HypixelGuild {

    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public HypixelGuild(String name, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getGuild(name).getJSONHandler("guild");
    }

    public HypixelGuild(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getGuild(uuid);
    }

    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    public Double getLevel() {
        return GuildLevelingUtil.getLevel(jsonHandler.getSafeInt("exp"));
    }

    public int getExperience() {
        return jsonHandler.getSafeInt("exp");
    }

    public List<HypixelGuildMember> getMembers() {
        return jsonHandler.getSafeJSONArray("members").toList().stream().map(playerObject -> {
            JSONHandler playerJSONHandler = new JSONHandler(
                (JSONObject) JSONObject.wrap(playerObject));
            return new HypixelGuildMember(playerJSONHandler, this, requestController);
        }).collect(Collectors.toList());
    }

    public HypixelGuildMember getMemberByUUID(UUID uuid) {
        return getMembers().stream().filter(member -> member.getUUID().equals(uuid)).findFirst()
            .get();
    }

    public HypixelGuildMember getOwner() {
        return getMembers().stream()
            .filter(member -> member.getRank().getName().equals("Guild Master")).findFirst().get();
    }

    public long getDailyGEXP() {
        throw new UnsupportedOperationException();
    }

    public boolean isPubliclyListed() {
        return jsonHandler.getSafeBoolean("publiclyListed");
    }

    public String getDescription() {
        return jsonHandler.getSafeString("description");
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public int getCoinsEver() {
        return jsonHandler.getSafeInt("coinsEver");
    }

    public String getTag() {
        return jsonHandler.getSafeString("tag");
    }

    public HypixelColors getTagColor() {
        return HypixelColors.valueOf(jsonHandler.getSafeString("tagColor"));
    }

    public Instant getDateCreated() {
        return Instant.ofEpochSecond(jsonHandler.getSafeLong("created"));
    }

    public int getChatMute() {
        return jsonHandler.getSafeInt("chatMute");
    }

    public List<HypixelGuildRank> getGuildRanks() {
        return jsonHandler.getSafeJSONArray("ranks").toList().stream().map(rankObject -> {
            JSONHandler rankJSONHandler = new JSONHandler((JSONObject) JSONObject.wrap(rankObject));
            return new HypixelGuildRank(rankJSONHandler);
        }).collect(Collectors.toList());
    }

    public int getGXPByGameType(HypixelGameTypes type) {

        AtomicInteger gameTypeGXP = new AtomicInteger();

        jsonHandler.getJSONHandler("guildExpByGameType").getKeys().forEachRemaining(gameType -> {
            if (gameType.equals(type.toString())) {
                gameTypeGXP.set(
                    jsonHandler.getJSONHandler("guildExpByGameType").getSafeInt(gameType));
            }
        });
        return gameTypeGXP.get();
    }

    public int getPlacementOnLeaderboard() {
        throw new UnsupportedOperationException();
    }
}