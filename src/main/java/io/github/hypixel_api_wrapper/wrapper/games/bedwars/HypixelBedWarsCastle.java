package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsCastle extends AbstractHypixelBedWars {

    public HypixelBedWarsCastle(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "castle_";
    }

}
