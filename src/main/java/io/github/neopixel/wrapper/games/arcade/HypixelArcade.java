package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

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

    public int getHitwRecordQ() {
        return jsonHandler.getSafeInt("hitw_record_q");
    }


    public int getStampLevel() {
        return jsonHandler.getSafeInt("stamp_level");
    }

    public int getPoopCollected() {
        return jsonHandler.getSafeInt("poop_collected");
    }

}
