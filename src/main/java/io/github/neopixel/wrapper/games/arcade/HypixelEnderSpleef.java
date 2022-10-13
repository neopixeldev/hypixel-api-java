package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelEnderSpleef extends HypixelGame {

    protected HypixelEnderSpleef(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ENDER_SPLEEF";
    }

    @Override
    public String getGameName() {
        return "Ender Spleef";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public String getTrail() {
        return jsonHandler.getSafeString("enderspleef_trail");
    }
}
