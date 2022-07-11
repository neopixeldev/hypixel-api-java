package io.github.hypixel_api_wrapper.wrapper.games.battleground;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelBattleground extends HypixelGame {

    protected HypixelBattleground(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "BATTLEGROUND";
    }

    @Override
    public String getGameName() {
        return "Warlords";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
