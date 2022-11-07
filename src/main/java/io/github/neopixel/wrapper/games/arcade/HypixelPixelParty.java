package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelPixelParty extends HypixelGame {

    protected HypixelPixelParty(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "PIXEL_PARTY";
    }

    @Override
    public String getGameName() {
        return "Pixel Party";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played");
    }

    public int getGamesPlayedNormal() {
        return jsonHandler.getSafeInt("games_played_normal");
    }

    public int getHighestRound() {
        return jsonHandler.getSafeInt("highest_round");
    }

    public int getRoundsCompleted() {
        return jsonHandler.getSafeInt("rounds_completed");
    }

    public int getRoundsCompletedNormal() {
        return jsonHandler.getSafeInt("rounds_completed_normal");
    }

    public int getPowerUpsCollected() {
        return jsonHandler.getSafeInt("power_ups_collected");
    }

    public int getPowerUpsCollectedNormal() {
        return jsonHandler.getSafeInt("power_ups_collected_normal");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public int getWinsNormal() {
        return jsonHandler.getSafeInt("wins_normal");
    }
}
