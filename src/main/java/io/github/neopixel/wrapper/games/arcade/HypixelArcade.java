package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.games.housing.HypixelHousing;
import io.github.neopixel.wrapper.player.HypixelFriend;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.time.Instant;

public class HypixelArcade extends HypixelGame {

    protected HypixelArcade(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ARCADE";
    }

    @Override
    public String getGameName() {
        return "Arcade";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public boolean isHintsEnabled() {
        return jsonHandler.getSafeBoolean("hints");
    }

    public boolean isMusicEnabled() {
        return jsonHandler.getSafeBoolean("music");
    }

    public int getWeeklyCoinsA() {
        return jsonHandler.getSafeInt("coins_weekly_a");
    }

    public int getWeeklyCoinsB() {
        return jsonHandler.getSafeInt("coins_weekly_b");
    }

    public int getMonthlyCoinsA() {
        return jsonHandler.getSafeInt("monthly_coins_a");
    }

    public int getMonthlyCoinsB() {
        return jsonHandler.getSafeInt("monthly_coins_b");
    }

    public int getStampLevel() {
        return jsonHandler.getSafeInt("stamp_level");
    }

    public int getPoopCollected() {
        return jsonHandler.getSafeInt("poop_collected");
    }

    public Instant getLastTourneyAd() {
        return Instant.ofEpochSecond(jsonHandler.getSafeLong("lastTourneyAd"));
    }

    public boolean isShowInFoBook() {
        return jsonHandler.getSafeBoolean("showinfobook");
    }

    public int getMaxWave() {
        return jsonHandler.getSafeInt("max_wave");
    }


    public HypixelHitw getHitwStats() {
        return new HypixelHitw(jsonHandler);
    }

    public HypixelPixelParty getPixelPartyStats() {
        return new HypixelPixelParty(jsonHandler.getJSONHandler("pixel_party"));
    }

    public HypixelArcadeSW getArcadeSWStats() {
        return new HypixelArcadeSW(jsonHandler);
    }

    public HypixelOneInTheQuiver getOneInTheQuiverStats() {
        return new HypixelOneInTheQuiver(jsonHandler);
    }

    public HypixelDayOne getDayOneStats() {
        return new HypixelDayOne(jsonHandler);
    }

    public HypixelZombies getZombiesStats() {
        return new HypixelZombies(jsonHandler);
    }

    public HypixelPartyGames getPartyGamesStats() {
        return new HypixelPartyGames(jsonHandler);
    }

    public HypixelSantaSays getSantaSaysStats() {
        return new HypixelSantaSays(jsonHandler);
    }

    public HypixelHalloweenSimulator getHalloweenSimulatorStats() {
        return new HypixelHalloweenSimulator(jsonHandler);
    }

    public HypixelFarmHunt getFarmHuntStats() {
        return new HypixelFarmHunt(jsonHandler);
    }

    public HypixelSoccer getSoccerStats() {
        return new HypixelSoccer(jsonHandler);
    }

    public HypixelEnderSpleef getEnderSpleefStats() {
        return new HypixelEnderSpleef(jsonHandler);
    }

    public HypixelDragonWars2 getDragonWars2Stats() {
        return new HypixelDragonWars2(jsonHandler);
    }

    public HypixelHideAndSeek getHideAndSeekStats() {
        return new HypixelHideAndSeek(jsonHandler);
    }

    public HypixelEnder getEnderStats() {
        return new HypixelEnder(jsonHandler);
    }

    public HypixelThrowout getThrowoutStats() {
        return new HypixelThrowout(jsonHandler);
    }

    public HypixelSimonSays getSimonSaysStats() {
        return new HypixelSimonSays(jsonHandler);
    }

    public HypixelHoleInTheWall getHoleInTheWallStats() {
        return new HypixelHoleInTheWall(jsonHandler);
    }

}
