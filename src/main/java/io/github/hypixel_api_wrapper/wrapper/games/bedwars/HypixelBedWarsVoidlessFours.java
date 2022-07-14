package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsVoidlessFours extends AbstractHypixelBedWars {

    public HypixelBedWarsVoidlessFours(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_four_voidless_";
    }
}
