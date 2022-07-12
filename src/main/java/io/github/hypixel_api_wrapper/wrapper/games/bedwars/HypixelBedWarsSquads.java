package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsSquads extends HypixelBedWars {

    public HypixelBedWarsSquads(JSONObject stats) {
        super(stats);
    }

    @Override
    public int getFKDR() {
        throw new UnsupportedOperationException();
    }
}
