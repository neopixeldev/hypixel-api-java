package io.github.hypixel_api_wrapper.wrapper.games.bedwars;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBedWars extends HypixelGame {

    HypixelBedWarsSolos solos;
    HypixelBedWarsDoubles doubles;
    HypixelBedWarsTrios trios;
    HypixelBedWarsSquads squads;

    protected HypixelBedWars(JSONObject stats) {
        super(stats);

        solos = new HypixelBedWarsSolos(stats);
        doubles = new HypixelBedWarsDoubles(stats);
        trios = new HypixelBedWarsTrios(stats);
        squads = new HypixelBedWarsSquads(stats);
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
