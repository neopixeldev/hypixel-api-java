package io.github.hypixel_api_wrapper.games;

public class HypixelTurboKart implements HypixelGame {
    @Override
    public String getGameID() {
        return "GINGERBREAD";
    }

    @Override
    public String getGameName() {
        return "Turbo Kart Racers";
    }

    @Override
    public boolean isNetworkPresent() {
        return true;
    }
}
