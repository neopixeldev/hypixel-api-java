package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsTrios extends AbstractHypixelBedWars {

    public HypixelBedWarsTrios(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_three_";
    }

}
