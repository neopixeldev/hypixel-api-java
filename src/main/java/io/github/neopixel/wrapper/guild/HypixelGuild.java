package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.util.GuildLevelingUtil;
import io.github.neopixel.wrapper.util.HypixelColors;
import io.github.neopixel.wrapper.util.HypixelGameTypes;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.json.JSONObject;

/**
 * A representation of a Guild on the Hypixel Network. Guilds are a group of
 * {@link io.github.neopixel.wrapper.player.HypixelPlayer}'s that play together on the server. They
 * can range up to 125 players.
 */
public class HypixelGuild {

    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public HypixelGuild(String name, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getGuildByName(name).getJSONHandler("guild");
    }

    public HypixelGuild(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getGuildByPlayerUUID(uuid).getJSONHandler("guild");
    }

    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    /**
     * Guilds levels are determined by the amount of {@link #getExperience() experience} the guild
     * has. The amount of {@link #getExperience() experience} required to level up to the next level
     * is exponential.
     *
     * @return The level of the guild.
     * @see GuildLevelingUtil
     */
    public Double getLevel() {
        return GuildLevelingUtil.getLevel(jsonHandler.getSafeInt("exp"));
    }

    /**
     * Members of a guild can earn guild experience to level up the guild. There is a soft cap on
     * the amount of GEXP a player can gain throughout a day.
     *
     * @return The guilds total experience.
     */
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

    public Optional<HypixelGuildMember> getMemberByUUID(UUID uuid) {
        return getMembers().stream().filter(member -> member.getUUID().equals(uuid)).findFirst();
    }

    /**
     *
     * @return The guild's owner.
     */
    public HypixelGuildMember getOwner() {
        return getMembers().stream()
            .filter(member -> member.getRank().getName().equals("Guild Master")).findFirst().get();
    }

    /**
     * @return true if the guild is publicily listed on the Hypixel Network. This means any User can
     * see it on the list of guilds provided by the server.
     */
    public boolean isPubliclyListed() {
        return jsonHandler.getSafeBoolean("publiclyListed");
    }

    /**
     * @return A short description of the guild.
     */
    public String getDescription() {
        return jsonHandler.getSafeString("description");
    }

    /**
     * The number of coins the guild has prior to the 2018 Guild update. Coins we're used to purchase
     * cosmetics, tags, member slots, ect. They are now replaced with {@link #getExperience() guild experience}.
     * @return The number of coins the guild has.
     */
    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    /**
     * The number of coins earned by the guild prior to the 2018 guild update. This number did not decrease when cosmetics were purchased.
     * @return The number of coins the guild had.
     */
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

    /**
     *
     * @return  A list of all the {@link HypixelGuildRank ranks} that a guild has.
     */
    public List<HypixelGuildRank> getGuildRanks() {
        return jsonHandler.getSafeJSONArray("ranks").toList().stream().map(rankObject -> {
            JSONHandler rankJSONHandler = new JSONHandler((JSONObject) JSONObject.wrap(rankObject));
            return new HypixelGuildRank(rankJSONHandler);
        }).collect(Collectors.toList());
    }

    /**
     * Retrieves the total amount of {@link #getExperience() experience} the guild has in the specific {@link HypixelGameTypes}.
     * @param type The type of gamemode being retrieved.
     * @return The amount of experienced earned in the particular game.
     */
    public int getExperienceByGameType(HypixelGameTypes type) {
        AtomicInteger gameTypeGXP = new AtomicInteger();

        jsonHandler.getJSONHandler("guildExpByGameType").getKeys().forEachRemaining(gameType -> {
            if (gameType.equals(type.toString())) {
                gameTypeGXP.set(
                    jsonHandler.getJSONHandler("guildExpByGameType").getSafeInt(gameType));
            }
        });
        return gameTypeGXP.get();
    }

    public int getDailyGXP() {

        AtomicInteger dailyGXP = new AtomicInteger();

        getMembers().forEach(member -> {
            dailyGXP.addAndGet(member.getDailyGXP());
        });
        return dailyGXP.get();
    }

    public int getWeeklyGXP() {
        AtomicInteger dailyGXP = new AtomicInteger();

        getMembers().forEach(member -> {
            dailyGXP.addAndGet(member.getWeeklyGXP());
        });
        return dailyGXP.get();
    }
}