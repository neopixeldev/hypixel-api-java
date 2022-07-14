package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsRushDoubles extends AbstractHypixelBedWars {

    public HypixelBedWarsRushDoubles(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "eight_two_rush_";
    }

}
