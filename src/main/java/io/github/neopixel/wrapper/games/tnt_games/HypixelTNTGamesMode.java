package io.github.neopixel.wrapper.games.tnt_games;

public enum HypixelTNTGamesMode {
    CAPTURE("capture"),
    BOWSPLEEF("bowspleef"),
    TNT_RUN("tntrun"),
    FIRE_WIZARD("firewizard"),
    ICE_WIZARD("icewizard"),
    KINETIC_WIZARD("kineticwizard"),
    SPLEEF("spleef"),
    TNT_TAG("tntag"),
    WITHER_WIZARD("witherwizard"),
    PVP_RUN("pvprun"),
    BLOOD_WIZARD("bloodwizard");

    String statsPrefix;

    HypixelTNTGamesMode(String statsPrefix) {
        this.statsPrefix = statsPrefix;
    }

    public String getStatsPrefix() {
        return statsPrefix;
    }
}
