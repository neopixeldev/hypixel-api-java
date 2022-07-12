package io.github.hypixel_api_wrapper.wrapper.games.classic.tkr;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelTurboKartRacers extends HypixelGame {

    protected HypixelTurboKartRacers(JSONObject stats) {
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
