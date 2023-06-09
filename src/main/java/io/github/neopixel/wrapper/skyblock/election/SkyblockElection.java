package io.github.neopixel.wrapper.skyblock.election;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.skyblock.election.candidate.ElectionCandidate;
import io.github.neopixel.wrapper.skyblock.election.perk.MayorPerk;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class SkyblockElection {

    private final JSONHandler jsonHandler;

    public SkyblockElection(RequestController requestController) {
        this.jsonHandler = requestController.getSkyblockElection().getJSONHandler("mayor");
    }

    /**
     * @return The type of the current mayor. (Ex. mining) // TODO: We should prob make an enum for these.
     */
    public String getKey() {
        return jsonHandler.getSafeString("key");
    }

    /**
     * @return The name of the mayor (Ex. Cole)
     */
    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    /**
     * @return A list all the mayors active perks.
     * @see MayorPerk
     */
    public List<MayorPerk> getPerks() {
        return jsonHandler.getSafeJSONArray("perks").toList().stream().map(perksObject -> {
            JSONHandler perksJson = new JSONHandler((JSONObject) JSONObject.wrap(perksObject));
            return new MayorPerk(perksJson);
        }).collect(Collectors.toList());
    }

    public CurrentElection getElection() {
        return new CurrentElection(jsonHandler.getJSONHandler("election"));
    }
}
