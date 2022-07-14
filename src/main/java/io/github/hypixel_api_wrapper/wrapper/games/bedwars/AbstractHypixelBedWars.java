package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public abstract class AbstractHypixelBedWars extends HypixelGame {

    protected AbstractHypixelBedWars(JSONObject stats) {
        super(stats);
    }

    abstract String prefix();

    @Override
    public String getGameID() {
        return "BEDWARS";
    }

    @Override
    public String getGameName() {
        return "Bed Wars";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getDiamondsCollected() {
        throw new UnsupportedOperationException();
    }

    public int getEmeraldsCollected() {
        throw new UnsupportedOperationException();
    }

    public int getGoldCollected() {
        throw new UnsupportedOperationException();
    }

    public int getIronCollected() {
        throw new UnsupportedOperationException();
    }

    public int getKills() {
        throw new UnsupportedOperationException();
    }

    public int getDeaths() {
        throw new UnsupportedOperationException();
    }

    public double getKillToDeathRatio() {
        return getKills() / Math.max(getDeaths(), 1);
    }

    public int getFinalKills() {
        throw new UnsupportedOperationException();
    }

    public int getFinalDeaths() {
        throw new UnsupportedOperationException();
    }

    public double getFinalKillToDeathRatio() {
        return getFinalKills() / Math.max(getFinalDeaths(), 1);
    }

    public int getWins() {
        throw new UnsupportedOperationException();
    }

    public int getLosses() {
        throw new UnsupportedOperationException();
    }

    public double getWinToLossRatio() {
        return getWins() / Math.max(getLosses(), 1);
    }

    public int getBedsBroken() {
        throw new UnsupportedOperationException();
    }

    public int getVoidKills() {
        throw new UnsupportedOperationException();
    }

    public int getVoidFinalKills() {
        throw new UnsupportedOperationException();
    }

    public int getProjectileDeaths() {
        throw new UnsupportedOperationException();
    }

    public int getProjectileKills() {
        throw new UnsupportedOperationException();
    }

    public int getItemsPurchasedAmount() {
        throw new UnsupportedOperationException();
    }

    public int getGamesPlayed() {
        throw new UnsupportedOperationException();
    }

    public int getCurrentWinstreak() {
        throw new UnsupportedOperationException();
    }

}