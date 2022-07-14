package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsUltimateFours extends AbstractHypixelBedWars {

    public HypixelBedWarsUltimateFours(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_four_ultimate_";
    }


}
