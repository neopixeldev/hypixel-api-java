package io.github.neopixel.wrapper.games.uhc;

public enum HypixelUHCMode {

    SOLOS("solo"),
    TEAMS(""),

    SOLO_BRAWL("solo_brawl"),
    DUO_BRAWL("duo_brawl"),

    NO_DIAMONDS("no_diamonds"),

    RED_vs_BLUE("red_vs_blue");

    final String statsPrefix;

    HypixelUHCMode(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }

}
