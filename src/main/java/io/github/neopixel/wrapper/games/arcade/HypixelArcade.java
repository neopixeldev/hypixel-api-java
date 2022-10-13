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

    public boolean isHintsEnabled() {
        return jsonHandler.getSafeBoolean("hints");
    }

    public boolean isMusicEnabled() {
        return jsonHandler.getSafeBoolean("music");
    }

    // whole in the wall stats

    public int getHoleInTheWallRounds() {
        return jsonHandler.getSafeInt("rounds_hole_in_the_wall");
    }

    public int getHoleInTheWallWins() {
        return jsonHandler.getSafeInt("wins_hole_in_the_wall");
    }

    // simon says stats

    public int getSimonSaysRounds() {
        return jsonHandler.getSafeInt("rounds_simon_says");
    }

    public int getSimonSaysWins() {
        return jsonHandler.getSafeInt("wins_simon_says");
    }

    public int getSimonSaysTopScore() {
        return jsonHandler.getSafeInt("top_score_simon_says");
    }

    // throwout stats

    public int getThrowoutKills() {
        return jsonHandler.getSafeInt("kills_throw_out");
    }

    public int getThrowoutDeaths() {
        return jsonHandler.getSafeInt("deaths_throw_out");
    }

    // ender stats

    public int getEnderWins() {
        return jsonHandler.getSafeInt("wins_ender");
    }

    public int getEnderBigShotPowerupActivations() {
        return jsonHandler.getSafeInt("bigshot_powerup_activations_ender");
    }

    public int getEnderBlocksDestroyed() {
        return jsonHandler.getSafeInt("blocks_destroyed_ender");
    }

    public int getEnderPowerupActivations() {
        return jsonHandler.getSafeInt("powerup_activations_ender");
    }

    public int getEnderTripleShotPowerupActivations() {
        return jsonHandler.getSafeInt("tripleshot_powerup_activations_ender");
    }

    // party games stats

    // hide & seek stats

    public int getHideAndSeekPartyPooperSeekerWins() {
        return jsonHandler.getSafeInt("party_pooper_seeker_wins_hide_and_seek");
    }

    public int getHideAndSeekSeekerWins() {
        return jsonHandler.getSafeInt("seeker_wins_hide_and_seek");
    }

    public int getHideAndSeekHiderWins() {
        return jsonHandler.getSafeInt("hider_wins_hide_and_seek");
    }

    public int getHideAndSeekPartyPooperHiderWins() {
        return jsonHandler.getSafeInt("party_pooper_hider_wins_hide_and_seek");
    }

    public int getHideAndSeekPropHuntHiderWins() {
        return jsonHandler.getSafeInt("prop_hunt_hider_wins_hide_and_seek");
    }

    // dragon wars2 stats

    public int getDragonWars2Wins() {
        return jsonHandler.getSafeInt("wins_dragonwars2");
    }
    public int getDragonWars2Kills() {
        return jsonHandler.getSafeInt("kills_dragonwars2");
    }

    // hitw stats

    public int getHitwRecordQ() {
        return jsonHandler.getSafeInt("hitw_record_q");
    }

    public int getHitwRecordF() {
        return jsonHandler.getSafeInt("hitw_record_f");
    }

    // enderspleef stats

    public String getEnderSpleefTrail() {
        return jsonHandler.getSafeString("enderspleef_trail");
    }

    // soccer stats

    public int getSoccerWins() {
        return jsonHandler.getSafeInt("wins_soccer");
    }

    public int getSoccerGoals() {
        return jsonHandler.getSafeInt("goals_soccer");
    }

    public int getSoccerKicks() {
        return jsonHandler.getSafeInt("kicks_soccer");
    }

    public int getSoccerPowerKicks() {
        return jsonHandler.getSafeInt("powerkicks_soccer");
    }

    // farm hunt stats

    public int getFarmHuntWins() {
        return jsonHandler.getSafeInt("wins_farmhunt");
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

}
