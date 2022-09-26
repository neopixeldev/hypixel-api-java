package io.github.neopixel.wrapper.guild;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.player.HypixelPlayer;
import io.github.neopixel.wrapper.util.UnformattedStringToUUID;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import org.json.JSONObject;

/**
 * Used to retrieve statistics about a {@link io.github.neopixel.wrapper.player.HypixelPlayer HypixelPlayer's} guild statistics.
 */
public class HypixelGuildMember {

    private final JSONObject guildMemberObject;
    private final HypixelGuild guild;
    private final RequestController requestController;

    public HypixelGuildMember(JSONObject guildMemberObject, HypixelGuild guild, RequestController requestController) {
        this.guildMemberObject = guildMemberObject;
        this.guild = guild;
        this.requestController = requestController;
    }

    public Optional<HypixelGuildRank> getRank() {
        return guild.getGuildRanks().get().stream().filter(rank -> rank.getName().equals(guildMemberObject.getString("rank"))).findFirst();
    }

    public int getQuestParticipation() {
        return guildMemberObject.getInt("questParticipation");
    }

    public Instant getDateJoined() {
        return Instant.ofEpochSecond(guildMemberObject.getLong("joined"));
    }

    public UUID getUUID() {
        return UnformattedStringToUUID.convertUnformattedStringToUUID(guildMemberObject.getString("uuid"));
    }

    public HypixelPlayer asPlayer() {
        return new HypixelPlayer(getUUID(), requestController);
    }
}
