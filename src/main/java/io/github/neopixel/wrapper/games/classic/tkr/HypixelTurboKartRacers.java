package io.github.neopixel.wrapper.games.classic.tkr;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

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
