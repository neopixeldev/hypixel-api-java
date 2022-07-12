package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsSolos extends HypixelBedWars{

    public HypixelBedWarsSolos(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "eight_one_";
    }


}
