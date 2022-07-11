package io.github.hypixel_api_wrapper.wrapper.games.classic.turbo_kart;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

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
    public boolean isPresentOnNetwork() {
        return true;
    }
}
