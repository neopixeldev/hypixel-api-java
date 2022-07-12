package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public abstract class HypixelBedWars extends HypixelGame {

    HypixelBedWars solos;
    HypixelBedWars doubles;
    HypixelBedWars trios;
    HypixelBedWars squads;
    HypixelBedWars coreModes;
    HypixelBedWars fourVSfour;
    HypixelBedWars rushSolo;
    HypixelBedWars rushDoubles;
    HypixelBedWars rushFours;
    HypixelBedWars ultimateSolo;
    HypixelBedWars ultimateDoubles;
    HypixelBedWars ultimateFours;
    HypixelBedWars luckyDoubles;
    HypixelBedWars luckyFours;
    HypixelBedWars castle;
    HypixelBedWars capture;
    HypixelBedWars swapDoubles;
    HypixelBedWars swapFours;
    HypixelBedWars voidlessFours;

    protected HypixelBedWars(JSONObject stats) {

        super(stats);

        solos = new HypixelBedWarsSolos(stats);
        doubles = new HypixelBedWarsDoubles(stats);
        trios = new HypixelBedWarsTrios(stats);
        squads = new HypixelBedWarsSquads(stats);
        coreModes = new HypixelBedWarsCoreModes(stats);
        fourVSfour = new HypixelBedWars4v4(stats);
        rushSolo = new HypixelBedWarsRushSolo(stats);
        rushDoubles = new HypixelBedWarsRushDoubles(stats);
        rushFours = new HypixelBedWarsRushFours(stats);
        ultimateSolo = new HypixelBedWarsUltimateSolos(stats);
        ultimateDoubles = new HypixelBedWarsUltimateDoubles(stats);
        ultimateFours = new HypixelBedWarsUltimateFours(stats);
        luckyDoubles = new HypixelBedWarsLuckyDoubles(stats);
        luckyFours = new HypixelBedWarsLuckyFours(stats);
        castle = new HypixelBedWarsCastle(stats);
        capture = new HypixelBedwarsCapture(stats);
        swapDoubles = new HypixelBedWarsSwapDoubles(stats);
        swapFours = new HypixelBedWarsSwapFours(stats);
        voidlessFours = new HypixelBedWarsVoidlessFours(stats);

    }

    abstract String dataLocation();
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

    /**
     * Methods that should not be overridden by subclasses.
     */

    public final int getCoins() {
        throw new UnsupportedOperationException();
    }

    public final int getLevel() {
        throw new UnsupportedOperationException();
    }

    public final int getExperience() {
        throw new UnsupportedOperationException();
    }

    public final String getBoxEpics() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveVictoryDance() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveIslandTopper() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveSprays() {
        throw new UnsupportedOperationException();
    }

    public final String getActiveDeathCry() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedCommonChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedRareChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedEpicChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getOpenedLegendaryChestsAmount() {
        throw new UnsupportedOperationException();
    }

    public final int getChristmasChestsAmount() {
        throw new UnsupportedOperationException();
    }

    /**
     * These methods apply to BedWars overall, but should be overridden by subclasses because they
     * also apply to each game mode.
     */

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
        return getKills() / getDeaths();
    }

    public int getFinalKills() {
        throw new UnsupportedOperationException();
    }

    public int getFinalDeaths() {
        throw new UnsupportedOperationException();
    }

    public double getFinalKillToDeathRatio() {
        return getFinalKills() / getFinalDeaths();
    }

    public int getWins() {
        throw new UnsupportedOperationException();
    }

    public int getLosses() {
        throw new UnsupportedOperationException();
    }

    public double getWinToLossRatio() {
        return getWins() / getLosses();
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

    public int getItemsPurchased() {
        throw new UnsupportedOperationException();
    }

    public int getGamesPlayed() {
        throw new UnsupportedOperationException();
    }

    public int getCurrentWinstreak() {
        throw new UnsupportedOperationException();
    }

}
