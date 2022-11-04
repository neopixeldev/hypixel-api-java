package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelHideAndSeek extends HypixelGame {

    protected HypixelHideAndSeek(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "HIDE_AND_SEEK";
    }

    @Override
    public String getGameName() {
        return "Hide and Seek";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getPartyPooperSeekerWins() {
        return jsonHandler.getSafeInt("party_pooper_seeker_wins_hide_and_seek");
    }

    public int getSeekerWins() {
        return jsonHandler.getSafeInt("seeker_wins_hide_and_seek");
    }

    public int getHiderWins() {
        return jsonHandler.getSafeInt("hider_wins_hide_and_seek");
    }

    public int getPartyPooperHiderWins() {
        return jsonHandler.getSafeInt("party_pooper_hider_wins_hide_and_seek");
    }

    public int getPropHuntHiderWins() {
        return jsonHandler.getSafeInt("prop_hunt_hider_wins_hide_and_seek");
    }

}
