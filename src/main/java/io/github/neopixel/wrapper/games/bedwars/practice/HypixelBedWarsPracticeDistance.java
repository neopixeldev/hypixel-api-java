package io.github.neopixel.wrapper.games.bedwars.practice;

public enum HypixelBedWarsPracticeDistance {
    DISTANCE_30(30),
    DISTANCE_50(50),
    DISTANCE_100(100);
    final int distance;

    HypixelBedWarsPracticeDistance(int distance) {
        this.distance = distance;
    }

    int getDistance() {
        return distance;
    }
}
