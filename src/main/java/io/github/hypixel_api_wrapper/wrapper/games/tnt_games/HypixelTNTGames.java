package io.github.hypixel_api_wrapper.wrapper.games.tnt_games;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelTNTGames implements HypixelGame {
    @Override
    public String getGameID() {
        return "TNTGAMES";
    }

    @Override
    public String getGameName() {
        return "TNT Games";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
