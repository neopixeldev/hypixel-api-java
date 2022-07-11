package io.github.hypixel_api_wrapper.wrapper.games;

public interface HypixelGame {
    public String getGameID();
    public String getGameName();

    /*
        @return a boolean stating whether the game has been removed from the Hypixel Network.
     */
    public boolean isRemoved();
}
