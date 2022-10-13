package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelHitw extends HypixelGame {

    protected HypixelHitw(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HITW";
    }

    @Override
    public String getGameName() {
        return "HitW";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getRecordQ() {
        return jsonHandler.getSafeInt("hitw_record_q");
    }

    public int getRecordF() {
        return jsonHandler.getSafeInt("hitw_record_f");
    }
}
