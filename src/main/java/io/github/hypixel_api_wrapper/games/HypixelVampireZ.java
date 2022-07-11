package io.github.hypixel_api_wrapper.games;

public class HypixelVampireZ implements HypixelGame {
    @Override
    public String getGameID() {
        return "VAMPIREZ";
    }

    @Override
    public String getGameName() {
        return "VampireZ";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
