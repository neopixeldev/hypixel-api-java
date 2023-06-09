package io.github.neopixel.wrapper.skyblock.election;

import io.github.neopixel.wrapper.skyblock.election.candidate.ElectionCandidate;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class CurrentElection {

    private final JSONHandler jsonHandler;

    public CurrentElection(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    /**
     * @return The current hypixel skyblock year.
     */
    public Integer getYear() {
        return jsonHandler.getSafeInt("year");
    }

    /**
     * @return All the current candidates in the running.
     * @see ElectionCandidate
     */
    public List<ElectionCandidate> getCandidates() {
        return jsonHandler.getSafeJSONArray("candidates").toList().stream().map(candidatesObject -> {
            JSONHandler electionJson = new JSONHandler((JSONObject) JSONObject.wrap(candidatesObject));
            return new ElectionCandidate(electionJson);
        }).collect(Collectors.toList());
    }
}