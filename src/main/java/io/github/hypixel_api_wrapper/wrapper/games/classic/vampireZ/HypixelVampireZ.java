package io.github.hypixel_api_wrapper.wrapper.games.classic.vampireZ;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

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
    public boolean isPresentOnNetwork() {
        return true;
    }
}
