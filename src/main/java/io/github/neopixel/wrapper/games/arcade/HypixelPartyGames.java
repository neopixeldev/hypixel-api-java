package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelPartyGames extends HypixelGame {

    protected HypixelPartyGames(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "PARTY_GAMES";
    }

    @Override
    public String getGameName() {
        return "Party Games";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_party");
    }

    public int getAnvilSpleefBestTime() {
        return jsonHandler.getSafeInt("anvil_spleef_best_time_party");
    }

    public int getCannonPaintingRoundWins() {
        return jsonHandler.getSafeInt("cannon_painting_round_wins_party");
    }

    public int getChickenRingsBestTime() {
        return jsonHandler.getSafeInt("chicken_rings_best_time_party");
    }

    public int getDiveBestScore() {
        return jsonHandler.getSafeInt("dive_best_score_party");
    }

    public int getDiveTotalScore() {
        return jsonHandler.getSafeInt("dive_total_score_party");
    }

    public int getLawnMoowerMowedBestScore() {
        return jsonHandler.getSafeInt("lawn_moower_mowed_best_score_party");
    }

    public int getLawnMoowerMowedTotalScore() {
        return jsonHandler.getSafeInt("lawn_moower_mowed_total_score_party");
    }

    public int getLawnMoowerWins() {
        return jsonHandler.getSafeInt("lawn_moower_wins_party");
    }

    public int getRoundWins() {
        return jsonHandler.getSafeInt("round_wins_party");
    }

    public int getTotalStars() {
        return jsonHandler.getSafeInt("total_stars_party");
    }

    public int getBombardmentBestTime() {
        return jsonHandler.getSafeInt("bombardment_best_time_party");
    }

    public int getFrozenFloorRoundWins() {
        return jsonHandler.getSafeInt("frozen_floor_round_wins_party");
    }

    public int getHighGroundBestScore() {
        return jsonHandler.getSafeInt("high_ground_best_score_party");
    }

    public int getHighGroundTotalScore() {
        return jsonHandler.getSafeInt("high_ground_total_score_party");
    }

    public int getJigsawRushBestTime() {
        return jsonHandler.getSafeInt("jigsaw_rush_best_time_party");
    }

    public int getRPG16KillsBestScore() {
        return jsonHandler.getSafeInt("rpg_16_kills_best_score_party");
    }

    public int getRPG16Kills() {
        return jsonHandler.getSafeInt("rpg_16_kills_party");
    }

    public int getRPG16RoundWins() {
        return jsonHandler.getSafeInt("rpg_16_round_wins_party");
    }

    public int getVolcanoRoundWins() {
        return jsonHandler.getSafeInt("volcano_round_wins_party");
    }

    public int getJungleJumpBestTime() {
        return jsonHandler.getSafeInt("jungle_jump_best_time_party");
    }

    public int getJungleJumpRoundWins() {
        return jsonHandler.getSafeInt("jungle_jump_round_wins_party");
    }

    public int getLabEscapeBestTime() {
        return jsonHandler.getSafeInt("lab_escape_best_time_party");
    }

    public int getMinecartRacingBestTime() {
        return jsonHandler.getSafeInt("minecart_racing_best_time_party");
    }

    public int getMinecartRacingRoundWins() {
        return jsonHandler.getSafeInt("minecart_racing_round_wins_party");
    }

    public int getSuperSheepRoundWins() {
        return jsonHandler.getSafeInt("super_sheep_round_wins_party");
    }

    public int getAnimalSlaughterBestScore() {
        return jsonHandler.getSafeInt("animal_slaughter_best_score_party");
    }

    public int getAnimalSlaughterKills() {
        return jsonHandler.getSafeInt("animal_slaughter_kills_party");
    }

    public int getHoeHoeBestScore() {
        return jsonHandler.getSafeInt("hoe_hee_best_score_party");
    }

    public int getHoeHoeTotalScore() {
        return jsonHandler.getSafeInt("hoe_hee_total_score_party");
    }

    public int getWorkshopRoundWins() {
        return jsonHandler.getSafeInt("workshop_round_wins_party");
    }

    public int getDiveRoundWins() {
        return jsonHandler.getSafeInt("dive_round_wins_party");
    }

    public int getFireLeapersRoundWins() {
        return jsonHandler.getSafeInt("fire_leapers_round_wins_party");
    }

    public int getPigFishingRoundWins() {
        return jsonHandler.getSafeInt("pig_fishing_round_wins_party");
    }

    public int getAvalancheRoundWins() {
        return jsonHandler.getSafeInt("avalanche_round_wins_party");
    }

    public int getAnvilSpleefRoundWins() {
        return jsonHandler.getSafeInt("anvil_spleef_round_wins_party");
    }

    public int getPigJoustingRoundWins() {
        return jsonHandler.getSafeInt("pig_jousting_round_wins_party");
    }

    public int getSpiderMazeBestTime() {
        return jsonHandler.getSafeInt("spider_maze_best_time_party");
    }

    public int getLabEscapeRoundWins() {
        return jsonHandler.getSafeInt("lab_escape_round_wins_party");
    }

    public int getTheFloorIsLavaBestTime() {
        return jsonHandler.getSafeInt("the_floor_is_lava_best_time_party");
    }

    public int getTheFloorIsLavaRoundWins() {
        return jsonHandler.getSafeInt("the_floor_is_lava_round_wins_party");
    }
}
