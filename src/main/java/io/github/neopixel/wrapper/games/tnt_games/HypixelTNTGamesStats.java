package io.github.neopixel.wrapper.games.tnt_games;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.bedwars.HypixelBedWars;
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

    public int getWinstreak() {
        return jsonHandler.getSafeInt("winstreak");
    }

    public int getTagSpeed() {
        return jsonHandler.getSafeInt("tag_speed");
    }

    public HypixelTNTGames getMode(HypixelTNTGamesMode mode) {
        JSONHandler jsonHandler = this.jsonHandler.getCopy();
        jsonHandler.setStatsPrefix(mode.getStatsPrefix());
        return new HypixelTNTGames(jsonHandler);
    }

}
