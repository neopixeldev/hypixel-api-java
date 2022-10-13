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


    // sw stats
    public int getSWKills() {
        return jsonHandler.getSafeInt("sw_kills");
    }

    public int getSWShotsFired() {
        return jsonHandler.getSafeInt("sw_shots_fired");
    }

    public int getSWWeeklyKillsA() {
        return jsonHandler.getSafeInt("sw_weekly_kills_a");
    }

    public int getSWWeeklyKillsB() {
        return jsonHandler.getSafeInt("sw_weekly_kills_b");
    }

    public int getSWRebelKills() {
        return jsonHandler.getSafeInt("sw_rebel_kills");
    }

    public int getSWDeaths() {
        return jsonHandler.getSafeInt("sw_deaths");
    }

    public int getSWMonthlyKillsA() {
        return jsonHandler.getSafeInt("sw_monthly_kills_a");
    }

    public int getSWMonthlyKillsB() {
        return jsonHandler.getSafeInt("sw_monthly_kills_b");
    }

    public int getSWEmpireKills() {
        return jsonHandler.getSafeInt("sw_empire_kills");
    }

    public boolean isMusicEnabled() {
        return jsonHandler.getSafeBoolean("music");
    }

    // One In The Quiver Stats

    public int getOneInTheQuiverWins() {
        return jsonHandler.getSafeInt("wins_oneinthequiver");
    }

    public int getOneInTheQuiverKills() {
        return jsonHandler.getSafeInt("kills_oneinthequiver");
    }

    public int getOneInTheQuiverDeaths() {
        return jsonHandler.getSafeInt("deaths_oneinthequiver");
    }

    public int getOneInTheQuiverBountyKills() {
        return jsonHandler.getSafeInt("bounty_kills_oneinthequiver");
    }

    // dayone stats

    public int getDayoneWins() {
        return jsonHandler.getSafeInt("wins_dayone");
    }

    public int getDayoneKills() {
        return jsonHandler.getSafeInt("kills_dayone");
    }

    public int getDayoneHeadshots() {
        return jsonHandler.getSafeInt("headshots_dayone");
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


    // zombies stats

    public int getZombiesBulletsHit() {
        return jsonHandler.getSafeInt("bullets_hit_zombies");
    }

    public int getZombiesBulletShot() {
        return jsonHandler.getSafeInt("bullet_shot_zombies");
    }

    public int getZombiesDeaths() {
        return jsonHandler.getSafeInt("deaths_zombies");
    }

    public int getZombiesDeadendDeath() {
        return jsonHandler.getSafeInt("deaths_zombies_deadend");
    }

    public int getZombiesHeadshots() {
        return jsonHandler.getSafeInt("headshots_zombies");
    }

    public int getZombiesBasicZombieKills() {
        return jsonHandler.getSafeInt("basic_zombies_kills_zombies");
    }

    public int getZombiesAlienArcadiumDeaths() {
        return jsonHandler.getSafeInt("deaths_zombies_alienarcadium");
    }

    public int getZombiesPigZombieKills() {
        return jsonHandler.getSafeInt("pig_zombie_zombie_kills_zombies");
    }

    public int getZombiesRainbowZombieKills() {
        return jsonHandler.getSafeInt("rainbow_zombie_kills_zombies");
    }

    public int getZombiesSkeletonZombieKills() {
        return jsonHandler.getSafeInt("skeleton_zombie_kills_zombies");
    }

    public int getZombiesSpaceBlasterZombieKills(){
        return jsonHandler.getSafeInt("space_blaster_zombie_kills_zombies");
    }

    public int getZombiesSpaceGruntZombieKills() {
        return jsonHandler.getSafeInt("space_grunt_zombie_kills_zombies");
    }

    public int getZombiesTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies");
    }

    public int getZombiesAlienArcadiumTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_alienarcadium");
    }

    public int getZombiesTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies");
    }

    public int getZombiesAlienArcadiumTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_alienarcadium");
    }

    public int getZombiesWindowsRepaired() {
        return jsonHandler.getSafeInt("windows_repaired_zombies");
    }

    public int getZombiesAlienArcadiumWindowsRepaired() {
        return jsonHandler.getSafeInt("windows_repaired_zombies_alienarcadium");
    }

    public int getZombiesWormSmallZombieKills() {
        return jsonHandler.getSafeInt("worm_small_zombie_kills_zombies");
    }

    public int getZombiesWormZombieKills() {
        return jsonHandler.getSafeInt("worm_zombie_kills_zombies");
    }

    public int getZombiesZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies");
    }

    public int getZombiesAlienArcadiumZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_alienarcadium");
    }

    public int getZombiesBlobZombieKills() {
        return jsonHandler.getSafeInt("blob_zombie_kills_zombies");
    }

    public int getZombiesDoorsOpened() {
        return jsonHandler.getSafeInt("doors_opened_zombies");
    }

    public int getZombiesAlienArcadiumDoorsOpened() {
        return jsonHandler.getSafeInt("doors_opened_zombies_alienarcadium");
    }

    public int getZombiesFastestTime10() {
        return jsonHandler.getSafeInt("fastest_time_10_zombies");
    }

    public int getZombiesBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies");
    }

    public int getZombiesDeadEndBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies_deadend");
    }

    public int getZombiesDeadEndNormalBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies_deadend_normal");
    }

    public int getZombiesEmpoweredZombieKills() {
        return jsonHandler.getSafeInt("empowered_zombie_kills_zombies");
    }

    public int getZombiesEnderZombieKills() {
        return jsonHandler.getSafeInt("ender_zombie_kills_zombies");
    }

    public int getZombiesEndermiteZombieKills() {
        return jsonHandler.getSafeInt("endermite_zombie_kills_zombies");
    }

    public int getZombiesDeadEndNormalFastestTime10() {
        return jsonHandler.getSafeInt("fastest_time_10_zombies_deadend_normal");
    }

    public int getZombiesFastestTime20() {
        return jsonHandler.getSafeInt("fastest_time_20_zombies");
    }

    public int getZombiesDeadEndNormalFastestTime20() {
        return jsonHandler.getSafeInt("fastest_time_20_zombies_deadend_normal");
    }

    public int getZombiesFastestTime30() {
        return jsonHandler.getSafeInt("fastest_time_30_zombies");
    }

    public int getZombiesDeadEndNormalFastestTime30() {
        return jsonHandler.getSafeInt("fastest_time_30_zombies_deadend_normal");
    }

    public int getZombiesFireZombieKills() {
        return jsonHandler.getSafeInt("fire_zombies_kills_zombies");
    }

    public int getZombiesGuardianZombieKills() {
        return jsonHandler.getSafeInt("guardian_zombie_kills_zombies");
    }

    public int getZombiesMagmaCubeZombieKills() {
        return jsonHandler.getSafeInt("magma_cube_zombie_kills_zombies");
    }

    public int getZombiesSilverfishZombieKills() {
        return jsonHandler.getSafeInt("silverfish_zombie_kills_zombies");
    }

    public int getZombiesSkelefishZombieKills() {
        return jsonHandler.getSafeInt("skelefish_zombie_kills_zombies");
    }

    public int getZombiesDeadEndTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_deadend");
    }

    public int getZombiesDeadEndNormalTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_deadend_normal");
    }

    public int getZombiesTNTBabyZombieKills() {
        return jsonHandler.getSafeInt("tnt_baby_zombie_kills_zombies");
    }

    public int getZombiesDeadEndTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_deadend");
    }

    public int getZombiesDeadEndNormalTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_deadend_normal");
    }

    public int getZombiesDeadEndWindowsRepaired() {
        return jsonHandler.getSafeInt("times_windows_repaired_zombies_deadend");
    }

    public int getZombiesDeadEndNormalWindowsRepaired() {
        return jsonHandler.getSafeInt("times_windows_repaired_zombies_deadend_normal");
    }

    public int getZombiesWins() {
        return jsonHandler.getSafeInt("wins_zombies");
    }

    public int getZombiesDeadEndWins() {
        return jsonHandler.getSafeInt("wins_zombies_deadend");
    }

    public int getZombiesDeadEndNormalWins() {
        return jsonHandler.getSafeInt("wins_zombies_deadend_normal");
    }

    public int getZombiesWolfZombieKills() {
        return jsonHandler.getSafeInt("wolf_zombie_kills_zombies");
    }

    public int getZombiesDeadEndZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_deadend");
    }

    public int getZombiesDeadEndNormalZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_deadend_normal");
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
