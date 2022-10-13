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

    public int getPartyGamesWins() {
        return jsonHandler.getSafeInt("wins_party");
    }

    public int getPartyGamesAnvilSpleefBestTime() {
        return jsonHandler.getSafeInt("anvil_spleef_best_time_party");
    }

    public int getPartyGamesCannonPaintingRoundWins() {
        return jsonHandler.getSafeInt("cannon_painting_round_wins_party");
    }

    public int getPartyGamesChickenRingsBestTime() {
        return jsonHandler.getSafeInt("chicken_rings_best_time_party");
    }

    public int getPartyGamesDiveBestScore() {
        return jsonHandler.getSafeInt("dive_best_score_party");
    }

    public int getPartyGamesDiveTotalScore() {
        return jsonHandler.getSafeInt("dive_total_score_party");
    }

    public int getPartyGamesLawnMoowerMowedBestScore() {
        return jsonHandler.getSafeInt("lawn_moower_mowed_best_score_party");
    }

    public int getPartyGamesLawnMoowerMowedTotalScore() {
        return jsonHandler.getSafeInt("lawn_moower_mowed_total_score_party");
    }

    public int getPartyGamesLawnMoowerWins() {
        return jsonHandler.getSafeInt("lawn_moower_wins_party");
    }

    public int getPartyGamesRoundWins() {
        return jsonHandler.getSafeInt("round_wins_party");
    }

    public int getPartyGamesTotalStars() {
        return jsonHandler.getSafeInt("total_stars_party");
    }

    public int getPartyGamesBombardmentBestTime() {
        return jsonHandler.getSafeInt("bombardment_best_time_party");
    }

    public int getPartyGamesFrozenFloorRoundWins() {
        return jsonHandler.getSafeInt("frozen_floor_round_wins_party");
    }

    public int getPartyGamesHighGroundBestScore() {
        return jsonHandler.getSafeInt("high_ground_best_score_party");
    }

    public int getHighGroundTotalScore() {
        return jsonHandler.getSafeInt("high_ground_total_score_party");
    }

    public int getPartyGamesJigsawRushBestTime() {
        return jsonHandler.getSafeInt("jigsaw_rush_best_time_party");
    }

    public int getPartyGamesRPG16KillsBestScore() {
        return jsonHandler.getSafeInt("rpg_16_kills_best_score_party");
    }

    public int getPartyGamesRPG16Kills() {
        return jsonHandler.getSafeInt("rpg_16_kills_party");
    }

    public int getPartyGamesRPG16RoundWins() {
        return jsonHandler.getSafeInt("rpg_16_round_wins_party");
    }

    public int getPartyGamesVolcanoRoundWins() {
        return jsonHandler.getSafeInt("volcano_round_wins_party");
    }

    public int getPartyGamesJungleJumpBestTime() {
        return jsonHandler.getSafeInt("jungle_jump_best_time_party");
    }

    public int getPartyGamesJungleJumpRoundWins() {
        return jsonHandler.getSafeInt("jungle_jump_round_wins_party");
    }

    public int getPartyGamesLabEscapeBestTime() {
        return jsonHandler.getSafeInt("lab_escape_best_time_party");
    }

    public int getPartyGamesMinecartRacingBestTime() {
        return jsonHandler.getSafeInt("minecart_racing_best_time_party");
    }

    public int getPartyGamesMinecartRacingRoundWins() {
        return jsonHandler.getSafeInt("minecart_racing_round_wins_party");
    }

    public int getPartyGamesSuperSheepRoundWins() {
        return jsonHandler.getSafeInt("super_sheep_round_wins_party");
    }

    public int getPartyGamesAnimalSlaughterBestScore() {
        return jsonHandler.getSafeInt("animal_slaughter_best_score_party");
    }

    public int getPartyGamesAnimalSlaughterKills() {
        return jsonHandler.getSafeInt("animal_slaughter_kills_party");
    }

    public int getPartyGamesHoeHoeBestScore() {
        return jsonHandler.getSafeInt("hoe_hee_best_score_party");
    }

    public int getPartyGamesHoeHoeTotalScore() {
        return jsonHandler.getSafeInt("hoe_hee_total_score_party");
    }

    public int getPartyGamesWorkshopRoundWins() {
        return jsonHandler.getSafeInt("workshop_round_wins_party");
    }

    public int getPartyGamesDiveRoundWins() {
        return jsonHandler.getSafeInt("dive_round_wins_party");
    }

    public int getPartyGamesFireLeapersRoundWins() {
        return jsonHandler.getSafeInt("fire_leapers_round_wins_party");
    }

    public int getPartyGamesPigFishingRoundWins() {
        return jsonHandler.getSafeInt("pig_fishing_round_wins_party");
    }

    public int getPartyGamesAvalancheRoundWins() {
        return jsonHandler.getSafeInt("avalanche_round_wins_party");
    }

    public int getPartyGamesAnvilSpleefRoundWins() {
        return jsonHandler.getSafeInt("anvil_spleef_round_wins_party");
    }

    public int getPartyGamesPigJoustingRoundWins() {
        return jsonHandler.getSafeInt("pig_jousting_round_wins_party");
    }

    public int getPartyGamesSpiderMazeBestTime() {
        return jsonHandler.getSafeInt("spider_maze_best_time_party");
    }

    public int getPartyGamesLabEscapeRoundWins() {
        return jsonHandler.getSafeInt("lab_escape_round_wins_party");
    }

    public int getPartyGamesTheFloorIsLavaBestTime() {
        return jsonHandler.getSafeInt("the_floor_is_lava_best_time_party");
    }

    public int getPartyGamesTheFloorIsLavaRoundWins() {
        return jsonHandler.getSafeInt("the_floor_is_lava_round_wins_party");
    }


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

    // Halloween simulator stats

    public int getHalloweenSimulatorCandyFound() {
        return jsonHandler.getSafeInt("candy_found_halloween_simulator");
    }

    public int getHalloweenSimulatorWins() {
        return jsonHandler.getSafeInt("wins_halloween_simulator");
    }

    // santa says stats

    public int getSantaSaysRoundWins() {
        return jsonHandler.getSafeInt("round_wins_santa_says");
    }

    public int getSantaSaysTopScore() {
        return jsonHandler.getSafeInt("top_score_santa_says");
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
