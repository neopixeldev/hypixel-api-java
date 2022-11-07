package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
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

    public Instant getLastTourneyAd() {
        return Instant.ofEpochSecond(jsonHandler.getSafeLong("lastTourneyAd"));
    }

    public boolean isShowInfoBook() {
        return jsonHandler.getSafeBoolean("showinfobook");
    }

    public HypixelPixelParty getPixelPartyStats() {
        return new HypixelPixelParty(jsonHandler.getJSONHandler("pixel_party"));
    }

    public HypixelGalaxyWars getGalaxyWarsStats() {
        return new HypixelGalaxyWars(jsonHandler);
    }

    public HypixelBountyHunters getBountyHuntersStats() {
        return new HypixelBountyHunters(jsonHandler);
    }

    public HypixelBlockingDead getBlockingDayStats() {
        return new HypixelBlockingDead(jsonHandler);
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

    public HypixelScubaSimulator getScubaSimulatorStats() {
        return new HypixelScubaSimulator(jsonHandler);
    }

    public HypixelGrinchSimulator getGrinchSimulatorStats() {
        return new HypixelGrinchSimulator(jsonHandler);
    }

    public HypixelEasterSimulator getEasterSimulatorStats() {
        return new HypixelEasterSimulator(jsonHandler);
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

    public HypixelDragonWars getDragonWarsStats() {
        return new HypixelDragonWars(jsonHandler);
    }

    public HypixelHideAndSeek getHideAndSeekStats() {
        return new HypixelHideAndSeek(jsonHandler);
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
