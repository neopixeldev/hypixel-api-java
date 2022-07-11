package io.github.hypixel_api_wrapper.games;

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
    public boolean isNetworkPresent() {
        return true;
    }
}
