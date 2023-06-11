package io.github.neopixel.wrapper.games.bedwars.practice;

public enum HypixelBedWarsPracticeModeData {
    SUCCESSFUL_ATTEMPTS("successful_attempts"),
    BLOCKS_PLACED("blocks_placed"),
    FAILED_ATTEMPTS("failed_attempts");

    final String statsPrefix;

    HypixelBedWarsPracticeModeData(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
