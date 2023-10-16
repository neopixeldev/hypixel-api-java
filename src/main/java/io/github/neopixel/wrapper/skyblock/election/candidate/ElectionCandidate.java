package io.github.neopixel.wrapper.skyblock.election.candidate;

import io.github.neopixel.wrapper.skyblock.election.perk.MayorPerk;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class ElectionCandidate {

    private final JSONHandler jsonHandler;

    public ElectionCandidate(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    /**
     * @return The type of the mayor. (Ex. mining)
     */
    public String getKey() {
        return jsonHandler.getSafeString("key");
    }

    /**
     * @return The name of the mayor. (Ex. Cole)
     */
    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    /**
     * @return A list all the mayors potential perks.
     * @see MayorPerk
     */
    public List<MayorPerk> getPerks() {
        return jsonHandler.getSafeJSONArray("perks").toList().stream().map(perksObject -> {
            JSONHandler perksJson = new JSONHandler((JSONObject) JSONObject.wrap(perksObject));
            return new MayorPerk(perksJson);
        }).collect(Collectors.toList());
    }

    /**
     * @return The amount of votes the mayor has received.
     */
    public Integer getVotes() {
        return jsonHandler.getSafeInt("votes");
    }
}