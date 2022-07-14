package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsFours extends AbstractHypixelBedWars {

    public HypixelBedWarsFours(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_four_";
    }


}
