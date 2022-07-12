package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsTrios extends HypixelBedWars {
    
    public HypixelBedWarsTrios(JSONObject stats) {
        super(stats);
    }

    @Override
    public int getFKDR() {
        throw new UnsupportedOperationException();
    }
}
