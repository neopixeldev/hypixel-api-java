package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsLuckyDoubles extends AbstractHypixelBedWars {

    public HypixelBedWarsLuckyDoubles(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "eight_two_lucky_";
    }

}
