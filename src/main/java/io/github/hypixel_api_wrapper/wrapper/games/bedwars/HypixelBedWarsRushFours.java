package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsRushFours extends AbstractHypixelBedWars {

    protected HypixelBedWarsRushFours(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "four_four_rush_";
    }

}
