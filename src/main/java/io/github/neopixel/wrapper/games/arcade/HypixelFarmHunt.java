package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelFarmHunt extends HypixelGame {

    protected HypixelFarmHunt(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "FARM_HUNT";
    }

    @Override
    public String getGameName() {
        return "Farm Hunt";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getFarmHuntWins() {
        return jsonHandler.getSafeInt("wins_farmhunt");
    }

}