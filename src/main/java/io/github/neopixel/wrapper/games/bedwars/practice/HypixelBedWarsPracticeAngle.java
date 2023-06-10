package io.github.neopixel.wrapper.games.bedwars.practice;

public enum HypixelBedWarsPracticeAngle {
    STRAIGHT("STRAIGHT"),
    DIAGONAL("DIAGONAL");
    final String angle;

    HypixelBedWarsPracticeAngle(String angle) {
        this.angle = angle;
    }

    String getAngle() {
        return angle;
    }
}
