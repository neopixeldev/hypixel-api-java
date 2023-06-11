package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWars;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHCStats extends HypixelGame {

    protected HypixelUHCStats(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC";
    }

    @Override
    public String getGameName() {
        return "UHC Champions";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public boolean isTeammateDamage() {
        return jsonHandler.getSafeBoolean("teammate_damage");
    }

    public HypixelUHC getMode(HypixelUHCMode mode) {
        JSONHandler jsonHandler = this.jsonHandler.getCopy();
        jsonHandler.setStatsPrefix(mode.getStatsSuffix());
        return new HypixelUHC(jsonHandler);
    }
}
