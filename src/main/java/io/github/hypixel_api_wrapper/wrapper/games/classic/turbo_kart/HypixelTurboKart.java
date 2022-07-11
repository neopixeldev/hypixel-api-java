package io.github.hypixel_api_wrapper.wrapper.games.classic.turbo_kart;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelTurboKart extends HypixelGame {

    protected HypixelTurboKart(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "GINGERBREAD";
    }

    @Override
    public String getGameName() {
        return "Turbo Kart Racers";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
