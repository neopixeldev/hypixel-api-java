package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBedWars implements HypixelGame {

    JSONObject stats;
    HypixelBedwarsSolos solos;
    HypixelBedwarsDoubles doubles;
    HypixelBedwarsTrios trios;
    HypixelBedwarsSquads squads;

    public HypixelBedWars(JSONObject stats) {

        this.stats = stats;

        solos = new HypixelBedwarsSolos(stats);
        doubles = new HypixelBedwarsDoubles(stats);
        trios = new HypixelBedwarsTrios(stats);
        squads = new HypixelBedwarsSquads(stats);
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
