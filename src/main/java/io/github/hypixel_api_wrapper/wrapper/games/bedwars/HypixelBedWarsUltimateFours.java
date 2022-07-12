package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsUltimateFours extends HypixelBedWars {

    protected HypixelBedWarsUltimateFours(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_four_ultimate_";
    }


}
