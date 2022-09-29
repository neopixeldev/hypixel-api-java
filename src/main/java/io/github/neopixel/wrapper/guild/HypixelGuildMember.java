package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import io.github.neopixel.wrapper.util.JSONHandler;
import io.github.neopixel.wrapper.util.UnformattedStringToUUID;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/**
 * Used to retrieve statistics about a
 * {@link io.github.neopixel.wrapper.player.HypixelPlayer HypixelPlayer's} guild statistics.
 */
public class HypixelGuildMember {

    private final JSONHandler jsonHandler;
    private final HypixelGuild guild;
    private final RequestController requestController;

    public HypixelGuildMember(JSONHandler jsonHandler, HypixelGuild guild,
        RequestController requestController) {
        this.jsonHandler = jsonHandler;
        this.guild = guild;
        this.requestController = requestController;
    }

    public HypixelGuildRank getRank() {
        return guild.getGuildRanks().stream()
            .filter(rank -> rank.getName().equals(jsonHandler.getSafeString("rank"))).findFirst()
            .get();
    }

    public int getQuestParticipation() {
        return jsonHandler.getSafeInt("questParticipation");
    }

    public Instant getDateJoined() {
        return Instant.ofEpochSecond(jsonHandler.getSafeLong("joined"));
    }

    public UUID getUUID() {
        return UnformattedStringToUUID.convertUnformattedStringToUUID(
            jsonHandler.getSafeString("uuid"));
    }

    public int getDailyGXP() {
        String dailyGXPObject = jsonHandler.getJSONHandler("expHistory").getKeys().next();
        return jsonHandler.getJSONHandler("expHistory").getSafeInt(dailyGXPObject);
    }

    public int getWeeklyGXPCombined() {

        AtomicInteger weeklyGXP = new AtomicInteger();

        jsonHandler.getJSONHandler("expHistory").getKeys().forEachRemaining(date -> {
            weeklyGXP.addAndGet(jsonHandler.getJSONHandler("expHistory").getSafeInt(date));
        });

        return weeklyGXP.get();
    }

    public Map<Instant, Integer> getWeeklyGXPByDay() {

        Map<Instant, Integer> weeklyGXPByDateMap = new HashMap<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-mm-dd");

        jsonHandler.getJSONHandler("expHistory").getKeys().forEachRemaining(date -> {
            ZonedDateTime zonedDateTime = ZonedDateTime.parse(date, dateTimeFormatter);
            weeklyGXPByDateMap.put(zonedDateTime.toInstant(),
                jsonHandler.getJSONHandler("expHistory").getSafeInt(date));
        });

        return weeklyGXPByDateMap;
    }

    public int getMutedTill() {
        return jsonHandler.getSafeInt("mutedTill");
    }

    public HypixelPlayer asPlayer() {
        return new HypixelPlayer(getUUID(), requestController);
    }
}
