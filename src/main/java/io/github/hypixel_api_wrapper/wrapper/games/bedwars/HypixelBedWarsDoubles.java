package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsDoubles extends HypixelBedWars {

    public HypixelBedWarsDoubles(JSONObject stats) {
        super(stats);
    }

    @Override
    public int getFKDR() {
        throw new UnsupportedOperationException();
    }
}
