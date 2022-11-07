package io.github.neopixel.wrapper.games.tnt_games;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelTNTGamesStats extends HypixelGame {

    protected HypixelTNTGamesStats(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "TNTGAMES";
    }

    @Override
    public String getGameName() {
        return "TNT Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public int getWins(HypixelTNTGamesMode mode) {
        return jsonHandler.getSafeInt("wins_" + mode.getStatsPrefix());
    }

    public int getDeaths(HypixelTNTGamesMode mode) {
        return jsonHandler.getSafeInt("deaths_" + mode.getStatsPrefix());
    }

    public int getExplosions(HypixelTNTGamesMode mode) {
        return jsonHandler.getIntOrThrow(mode.getStatsPrefix() + "_explode", new UnsupportedOperationException("That gamemode may not support this type."));
    }

    public int getRegenerations(HypixelTNTGamesMode mode) {
        return jsonHandler.getIntOrThrow(mode.getStatsPrefix() + "_regen", new UnsupportedOperationException("That gamemode may not support this type."));
    }

}
