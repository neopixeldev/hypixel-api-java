package io.github.neopixel;

import io.github.neopixel.wrapper.player.HypixelPlayer;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        HypixelAPI api = HypixelAPI.create(UUID.fromString("d8e7f0b1-6dcf-4a96-993c-8f11cf2fe15b"));
        HypixelPlayer player = api.getPlayerByName("___");
        System.out.println(player.getNetworkLevel());
    }
}
