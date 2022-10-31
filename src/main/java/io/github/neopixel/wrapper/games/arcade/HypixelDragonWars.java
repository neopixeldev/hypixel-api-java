package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelDragonWars extends HypixelGame {

    protected HypixelDragonWars(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "DRAGON_WARS";
    }

    @Override
    public String getGameName() {
        return "Dragon Wars";
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
