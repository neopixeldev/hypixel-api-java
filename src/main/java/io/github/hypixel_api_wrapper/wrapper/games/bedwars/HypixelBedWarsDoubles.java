package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsDoubles extends AbstractHypixelBedWars {

    public HypixelBedWarsDoubles(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "eight_two_";
    }

}
