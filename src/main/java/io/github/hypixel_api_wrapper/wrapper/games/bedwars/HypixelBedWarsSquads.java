package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import org.json.JSONObject;

public class HypixelBedWarsSquads extends HypixelBedWars {

    public HypixelBedWarsSquads(JSONObject stats) {
        super(stats);
    }

    @Override
    public int getDiamondsCollected() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getEmeraldsCollected() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGoldCollected() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getIronCollected() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getDeaths() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getKillToDeathRatio() {
        return getKills() / getDeaths();
    }

    @Override
    public int getFinalKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getFinalDeaths() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getFinalKillToDeathRatio() {
        return getFinalKills() / getFinalDeaths();
    }

    @Override
    public int getWins() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLosses() {
        throw new UnsupportedOperationException();
    }

    @Override
    public double getWinToLossRatio() {
        return getWins() / getLosses();
    }

    @Override
    public int getBedsBroken() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getVoidKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getVoidFinalKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getProjectileDeaths() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getProjectileKills() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getItemsPurchased() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGamesPlayed() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getFireTickKills() {
        throw new UnsupportedOperationException();
    }
}
