package io.github.hypixel_api_wrapper.wrapper.games.build_battle;

import io.github.hypixel_api_wrapper.wrapper.games.HypixelGame;
import io.github.hypixel_api_wrapper.wrapper.util.JSONHandler;
import java.util.EnumSet;
import java.util.Map;
import java.util.Optional;

public class HypixelBuildBattle extends HypixelGame {

    protected HypixelBuildBattle(JSONHandler jsonHandler) {
        super(jsonHandler);
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

    public Optional<Integer> getSoloWins() {
        return jsonHandler.getSafeInt("wins_solo_normal");
    }

    public Optional<Integer> getTeamWins() {
        return jsonHandler.getSafeInt("wins_teams_normal");
    }

    public Optional<Integer> getWins() {
        return jsonHandler.getSafeInt("wins");
    }

    public Optional<Integer> getCoins() {
        return jsonHandler.getSafeInt("coins");
    }

    public Optional<Integer> getGuessTheBuildWins() {
        return jsonHandler.getSafeInt("wins_guess_the_build");
    }

    public Optional<Integer> getGamesPlayed() {
        return jsonHandler.getSafeInt("games_played");
    }

    public Optional<Integer> getScore() {
        return jsonHandler.getSafeInt("score");
    }

    public Optional<Integer> getMonthlyCoinsA() {
        return jsonHandler.getSafeInt("monthly_coins_a");
    }

    public Optional<Integer> getWeeklyCoinsB() {
        return jsonHandler.getSafeInt("weekly_coins_b");
    }

    public Optional<Integer> getCorrectGuesses() {
        return jsonHandler.getSafeInt("correct_guesses");
    }

    public Optional<Integer> getSoloMostPoints() {
        return jsonHandler.getSafeInt("solo_most_points");
    }

    public Optional<Integer> getWeeklyCoinsA() {
        return jsonHandler.getSafeInt("weekly_coins_a");
    }

    public Optional<Integer> getTotalVotes() {
        return jsonHandler.getSafeInt("total_votes");
    }

    public Optional<Integer> getSuperVotes() {
        return jsonHandler.getSafeInt("super_votes");
    }

    public Map<String, Integer> getLoadout() {
        throw new UnsupportedOperationException();
    }

    public EnumSet<HypixelBuildBattlePackages> getPackages() {
        throw new UnsupportedOperationException();
    }

    public HypixelBuildBattlePackages getSelectedHat() {
        return HypixelBuildBattlePackages.valueOf(jsonHandler.getSafeInt("new_selected_hat").get().toString().toUpperCase());
    }

    public Optional<Integer> getMonthlyCoinsB() {
        return jsonHandler.getSafeInt("monthly_coins_b");
    }
}
