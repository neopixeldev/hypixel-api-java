package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelThrowout extends HypixelGame {

    protected HypixelThrowout(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "THROWOUT";
    }

    @Override
    public String getGameName() {
        return "Throwout";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getKills() {
        return jsonHandler.getSafeInt("kills_throw_out");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths_throw_out");
    }
}
