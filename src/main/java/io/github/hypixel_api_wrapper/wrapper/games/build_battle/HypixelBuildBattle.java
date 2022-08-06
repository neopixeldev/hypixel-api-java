package io.github.hypixel_api_wrapper.wrapper.games.build_battle;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONObject;

public class HypixelBuildBattle extends HypixelGame {

    protected HypixelBuildBattle(JSONObject stats) {
        super(stats);
    }

    @Override
    public String getGameID() {
        return "BUILD_BATTLE";
    }

    @Override
    public String getGameName() {
        return "Build Battle";
    }

    @Override
    public boolean isRemoved() {
        return false;
    }

    public int getSoloWins() {
        return stats.getInt("wins_solo_normal");
    }

    public int getTeamWins() {
        return stats.getInt("wins_teams_normal");
    }

    public int getWins() {
        return stats.getInt("wins");
    }

    public int getCoins() {
        return stats.getInt("coins");
    }

    public int getGuessTheBuildWins() {
        return stats.getInt("wins_guess_the_build");
    }

    public int getGamesPlayed() {
        return stats.getInt("games_played");
    }

    public int getScore() {
        return stats.getInt("score");
    }

    public int getMonthlyCoinsA() {
        return stats.getInt("monthly_coins_a");
    }

    public int getWeeklyCoinsB() {
        return stats.getInt("weekly_coins_b");
    }

    public int getCorrectGuesses() {
        return stats.getInt("correct_guesses");
    }

    public int getSoloMostPoints() {
        return stats.getInt("solo_most_points");
    }

    public int getWeeklyCoinsA() {
        return stats.getInt("weekly_coins_a");
    }

    public int getTotalVotes() {
        return stats.getInt("total_votes");
    }

    public int getSuperVotes() {
        return stats.getInt("super_votes");
    }

    public Map<String, Integer> getLoadout() {
        throw new UnsupportedOperationException();
    }

    public EnumSet<BuildBattlePackages> getPackages() {
        // I'm not sure if this would work I am having a big brain fart
        return (EnumSet<BuildBattlePackages>) stats.get("packages");
    }

    public BuildBattlePackages getSelectedHat() {
        return BuildBattlePackages.valueOf(stats.getString("new_selected_hat").toUpperCase());
    }

    public int getMonthlyCoinsB() {
        return stats.getInt("monthly_coins_b");
    }
}
