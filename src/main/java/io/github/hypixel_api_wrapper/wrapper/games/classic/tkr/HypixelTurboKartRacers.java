package io.github.hypixel_api_wrapper.wrapper.games.classic.tkr;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelTurboKartRacers extends HypixelGame {

    protected HypixelTurboKartRacers(JSONHandler jsonHandler) {
        super(jsonHandler);
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
