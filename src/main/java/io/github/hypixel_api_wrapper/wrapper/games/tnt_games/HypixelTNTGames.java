package io.github.hypixel_api_wrapper.wrapper.games.tnt_games;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import org.json.JSONObject;

public class HypixelTNTGames extends HypixelGame {

    protected HypixelTNTGames(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "TNTGAMES";
    }

    @Override
    public String getGameName() {
        return "TNT Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
