package io.github.hypixel_api_wrapper.wrapper.games;

import org.json.JSONObject;

public class HypixelReplay extends HypixelGame {

    protected HypixelReplay(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "REPLAY";
    }

    @Override
    public String getGameName() {
        return "Replay";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }
}
