package io.github.hypixel_api_wrapper.wrapper.games;

import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import org.json.JSONObject;

public class HypixelReplay extends HypixelGame {

    protected HypixelReplay(JSONHandler jsonHandler) {
        super(jsonHandler);
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
