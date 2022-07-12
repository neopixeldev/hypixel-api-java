package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBedWars extends HypixelGame {

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

    public int getFKDR() {
        throw new UnsupportedOperationException();
    }

    public int getStar() {
        throw new UnsupportedOperationException();
    }
}
