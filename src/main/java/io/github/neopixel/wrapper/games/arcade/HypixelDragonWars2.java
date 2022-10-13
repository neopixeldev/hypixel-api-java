package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelDragonWars2 extends HypixelGame {

    protected HypixelDragonWars2(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "DRAGON_WARS_2";
    }

    @Override
    public String getGameName() {
        return "Dragon Wars 2";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_dragonwars2");
    }
    public int getKills() {
        return jsonHandler.getSafeInt("kills_dragonwars2");
    }
}
