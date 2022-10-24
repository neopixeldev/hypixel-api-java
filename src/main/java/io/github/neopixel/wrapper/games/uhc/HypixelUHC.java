package io.github.neopixel.wrapper.games.uhc;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelUHC extends HypixelGame {

    protected HypixelUHC(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "UHC";
    }

    @Override
    public String getGameName() {
        return "UHC Champions";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public boolean isTeammateDamage() {
        return jsonHandler.getSafeBoolean("teammate_damage");
    }

    public HypixelUHCBrawl getBrawlStats() {
        return new HypixelUHCBrawl(jsonHandler);
    }

    public HypixelUHCSoloBrawl getBrawlSolosStats() {
        return new HypixelUHCSoloBrawl(jsonHandler);
    }

    public HypixelUHCDuoBrawl getBrawlDoublesStats() {
        return new HypixelUHCDuoBrawl(jsonHandler);
    }

    public HypixelUHCNoDiamonds getNoDiamondsStats() {
        return new HypixelUHCNoDiamonds(jsonHandler);
    }

    public HypixelUHCRedVSBlue getRedVSBlueStats() {
        return new HypixelUHCRedVSBlue(jsonHandler);
    }

    public HypixelUHCSolos getSolosStats() {
        return new HypixelUHCSolos(jsonHandler);
    }

    public HypixelUHCTeams getTeamsStats() {
        return new HypixelUHCTeams(jsonHandler);
    }

    public HypixelUHCVanillaDoubles getVanillaDoublesStats() {
        return new HypixelUHCVanillaDoubles(jsonHandler);
    }

}
