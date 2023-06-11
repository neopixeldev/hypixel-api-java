package io.github.neopixel.wrapper.games.bedwars.practice;

public enum HypixelBedWarsPracticeMode {
    MLG("mlg"),
    BRIDGING("bridging"),
    FIREBALL_JUMPING("fireball_jumping");

    final String statsPrefix;

    HypixelBedWarsPracticeMode(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
