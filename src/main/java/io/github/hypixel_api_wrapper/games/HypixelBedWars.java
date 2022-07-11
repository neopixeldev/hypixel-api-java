package io.github.hypixel_api_wrapper.games;

public class HypixelBedWars implements HypixelGame {
    @Override
    public String getGameID() {
        return "BEDWARS";
    }

    @Override
    public String getGameName() {
        return "Bed Wars";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
