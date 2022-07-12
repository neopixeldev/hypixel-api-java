package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWars4v4 extends AbstractHypixelBedWars {

    public HypixelBedWars4v4(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "two_four_";
    }
}

