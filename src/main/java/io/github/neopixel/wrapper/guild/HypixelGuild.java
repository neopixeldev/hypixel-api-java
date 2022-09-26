package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import io.github.neopixel.wrapper.util.GuildLevelingUtil;
import io.github.neopixel.wrapper.util.HypixelColors;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class HypixelGuild {
    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public HypixelGuild(String name, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = new JSONHandler(requestController.getPlayer(name).getJSONObject("player"));
    }

    public HypixelGuild(UUID uuid, RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = new JSONHandler(requestController.getPlayer(uuid).getJSONObject("player"));
    }

    public Optional<String> getName() {
        return jsonHandler.getSafeString("name");
    }

    public Optional<Double> getLevel() {
        return Optional.of(GuildLevelingUtil.getLevel(jsonHandler.getSafeInt("exp").get()));
    }

    public Optional<Integer> getExperience() {
        return jsonHandler.getSafeInt("exp");
    }

    public List<HypixelGuildMember> getMembers() {
        return jsonHandler.getJSONArray("members").get().toList().stream().map(playerObject -> {
            JSONObject playerJSONObject = (JSONObject) playerObject;
            return new HypixelGuildMember(playerJSONObject, this, requestController);
        }).collect(Collectors.toList());
    }

    public HypixelPlayer getOwner() {
        throw new UnsupportedOperationException();
    }

    public long getDailyGEXP() {
        throw new UnsupportedOperationException();
    }

    public Optional<Boolean> isPubliclyListed() {
        return jsonHandler.getSafeBoolean("publiclyListed");
    }

    public Optional<String> getDescription() {
        return jsonHandler.getSafeString("description");
    }

    public Optional<Integer> getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public Optional<Integer> getCoinsEver() {
        return jsonHandler.getSafeInt("coinsEver");
    }

    public Optional<String> getTag() {
       return jsonHandler.getSafeString("tag");
    }

    public Optional<HypixelColors> getTagColor() {
        return Optional.of(HypixelColors.valueOf(jsonHandler.getSafeString("tagColor").get()));
    }

    public Optional<Instant> getDateCreated() {
        return Optional.ofNullable(Instant.ofEpochSecond(jsonHandler.getSafeLong("created").get()));
    }

    public Optional<Integer> getChatMute() {
        return jsonHandler.getSafeInt("chatMute");
    }

    public Optional<List<HypixelGuildRank>> getGuildRanks() {
        return Optional.of(jsonHandler.getJSONArray("ranks").get().toList().stream().map(rankObject -> {
            JSONObject rankJSONObject = (JSONObject) rankObject;
            return new HypixelGuildRank(rankJSONObject);
        }).collect(Collectors.toList()));
    }

    public int getPlacementOnLeaderboard() {
        throw new UnsupportedOperationException();
    }
}
