package io.github.neopixel.wrapper.games.bedwars.practice;

public enum HypixelBedWarsPracticeElevation {
    NONE("NONE"),
    SLIGHT("SLIGHT"),
    STAIRCASE("STAIRCASE");
    final String elevation;

    HypixelBedWarsPracticeElevation(String elevation) {
        this.elevation = elevation;
    }

    String getElevation() {
        return elevation;
    }
}
