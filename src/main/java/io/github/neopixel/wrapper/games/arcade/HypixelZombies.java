package io.github.neopixel.wrapper.games.arcade;

import io.github.neopixel.wrapper.games.HypixelGame;
import io.github.neopixel.wrapper.util.JSONHandler;

public class HypixelZombies extends HypixelGame {

    protected HypixelZombies(JSONHandler jsonHandler) {
        super(jsonHandler);
    }

    @Override
    public String getGameID() {
        return "ZOMBIES";
    }

    @Override
    public String getGameName() {
        return "Zombies";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getBulletsHit() {
        return jsonHandler.getSafeInt("bullets_hit_zombies");
    }

    public int getBulletShot() {
        return jsonHandler.getSafeInt("bullet_shot_zombies");
    }

    public int getDeaths() {
        return jsonHandler.getSafeInt("deaths_zombies");
    }

    public int getDeadendDeath() {
        return jsonHandler.getSafeInt("deaths_zombies_deadend");
    }

    public int getHeadshots() {
        return jsonHandler.getSafeInt("headshots_zombies");
    }

    public int getBasicZombieKills() {
        return jsonHandler.getSafeInt("basic_zombies_kills_zombies");
    }

    public int getAlienArcadiumDeaths() {
        return jsonHandler.getSafeInt("deaths_zombies_alienarcadium");
    }

    public int getPigZombieKills() {
        return jsonHandler.getSafeInt("pig_zombie_zombie_kills_zombies");
    }

    public int getRainbowZombieKills() {
        return jsonHandler.getSafeInt("rainbow_zombie_kills_zombies");
    }

    public int getSkeletonZombieKills() {
        return jsonHandler.getSafeInt("skeleton_zombie_kills_zombies");
    }

    public int getSpaceBlasterZombieKills(){
        return jsonHandler.getSafeInt("space_blaster_zombie_kills_zombies");
    }

    public int getSpaceGruntZombieKills() {
        return jsonHandler.getSafeInt("space_grunt_zombie_kills_zombies");
    }

    public int getTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies");
    }

    public int getAlienArcadiumTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_alienarcadium");
    }

    public int getTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies");
    }

    public int getAlienArcadiumTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_alienarcadium");
    }

    public int getWindowsRepaired() {
        return jsonHandler.getSafeInt("windows_repaired_zombies");
    }

    public int getAlienArcadiumWindowsRepaired() {
        return jsonHandler.getSafeInt("windows_repaired_zombies_alienarcadium");
    }

    public int getWormSmallZombieKills() {
        return jsonHandler.getSafeInt("worm_small_zombie_kills_zombies");
    }

    public int getWormZombieKills() {
        return jsonHandler.getSafeInt("worm_zombie_kills_zombies");
    }

    public int getZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies");
    }

    public int getAlienArcadiumZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_alienarcadium");
    }

    public int getBlobZombieKills() {
        return jsonHandler.getSafeInt("blob_zombie_kills_zombies");
    }

    public int getDoorsOpened() {
        return jsonHandler.getSafeInt("doors_opened_zombies");
    }

    public int getAlienArcadiumDoorsOpened() {
        return jsonHandler.getSafeInt("doors_opened_zombies_alienarcadium");
    }

    public int getFastestTime10() {
        return jsonHandler.getSafeInt("fastest_time_10_zombies");
    }

    public int getBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies");
    }

    public int getDeadEndBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies_deadend");
    }

    public int getDeadEndNormalBestRound() {
        return jsonHandler.getSafeInt("best_round_zombies_deadend_normal");
    }

    public int getEmpoweredZombieKills() {
        return jsonHandler.getSafeInt("empowered_zombie_kills_zombies");
    }

    public int getEnderZombieKills() {
        return jsonHandler.getSafeInt("ender_zombie_kills_zombies");
    }

    public int getEndermiteZombieKills() {
        return jsonHandler.getSafeInt("endermite_zombie_kills_zombies");
    }

    public int getDeadEndNormalFastestTime10() {
        return jsonHandler.getSafeInt("fastest_time_10_zombies_deadend_normal");
    }

    public int getFastestTime20() {
        return jsonHandler.getSafeInt("fastest_time_20_zombies");
    }

    public int getDeadEndNormalFastestTime20() {
        return jsonHandler.getSafeInt("fastest_time_20_zombies_deadend_normal");
    }

    public int getFastestTime30() {
        return jsonHandler.getSafeInt("fastest_time_30_zombies");
    }

    public int getDeadEndNormalFastestTime30() {
        return jsonHandler.getSafeInt("fastest_time_30_zombies_deadend_normal");
    }

    public int getFireZombieKills() {
        return jsonHandler.getSafeInt("fire_zombies_kills_zombies");
    }

    public int getGuardianZombieKills() {
        return jsonHandler.getSafeInt("guardian_zombie_kills_zombies");
    }

    public int getMagmaCubeZombieKills() {
        return jsonHandler.getSafeInt("magma_cube_zombie_kills_zombies");
    }

    public int getSilverfishZombieKills() {
        return jsonHandler.getSafeInt("silverfish_zombie_kills_zombies");
    }

    public int getSkelefishZombieKills() {
        return jsonHandler.getSafeInt("skelefish_zombie_kills_zombies");
    }

    public int getDeadEndTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_deadend");
    }

    public int getDeadEndNormalTimesKnockedDown() {
        return jsonHandler.getSafeInt("times_knocked_down_zombies_deadend_normal");
    }

    public int getTNTBabyZombieKills() {
        return jsonHandler.getSafeInt("tnt_baby_zombie_kills_zombies");
    }

    public int getDeadEndTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_deadend");
    }

    public int getDeadEndNormalTotalRoundsSurvived() {
        return jsonHandler.getSafeInt("total_rounds_survived_zombies_deadend_normal");
    }

    public int getDeadEndWindowsRepaired() {
        return jsonHandler.getSafeInt("times_windows_repaired_zombies_deadend");
    }

    public int getDeadEndNormalWindowsRepaired() {
        return jsonHandler.getSafeInt("times_windows_repaired_zombies_deadend_normal");
    }

    public int getWins() {
        return jsonHandler.getSafeInt("wins_zombies");
    }

    public int getDeadEndWins() {
        return jsonHandler.getSafeInt("wins_zombies_deadend");
    }

    public int getDeadEndNormalWins() {
        return jsonHandler.getSafeInt("wins_zombies_deadend_normal");
    }

    public int getWolfZombieKills() {
        return jsonHandler.getSafeInt("wolf_zombie_kills_zombies");
    }

    public int getDeadEndZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_deadend");
    }

    public int getDeadEndNormalZombieKills() {
        return jsonHandler.getSafeInt("zombie_kills_zombies_deadend_normal");
    }
}
