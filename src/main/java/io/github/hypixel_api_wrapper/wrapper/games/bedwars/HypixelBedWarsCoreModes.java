package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsCoreModes extends AbstractHypixelBedWars {

    protected HypixelBedWarsCoreModes(JSONObject stats) {
        super(stats);
    }

    @Override
    String prefix() {
        return "null";
    }

}
