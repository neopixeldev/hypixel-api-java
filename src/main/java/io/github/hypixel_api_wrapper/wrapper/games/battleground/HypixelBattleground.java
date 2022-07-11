package io.github.hypixel_api_wrapper.wrapper.games.battleground;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;

public class HypixelBattleground implements HypixelGame {
    @Override
    public String getGameID() {
        return "BATTLEGROUND";
    }

    @Override
    public String getGameName() {
        return "Warlords";
    }

    @Override
    public boolean isPresentOnNetwork() {
        return true;
    }
}
