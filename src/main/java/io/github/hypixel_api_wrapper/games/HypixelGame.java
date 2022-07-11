package io.github.hypixel_api_wrapper.games;

public interface HypixelGame {
    public String getGameID();
    public String getGameName();

    /*
        @return a boolean stating whether the game is currently present and playable on the Hypixel Network.
     */
    public boolean isNetworkPresent();
}
