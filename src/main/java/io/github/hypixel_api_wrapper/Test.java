package io.github.hypixel_api_wrapper;

import io.github.hypixel_api_wrapper.HypixelAPI;
import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        HypixelAPI api = HypixelAPI.create(UUID.fromString("d8e7f0b1-6dcf-4a96-993c-8f11cf2fe15b"));
        HypixelPlayer player = api.getPlayerByName("sk1er");
        System.out.println(player.getNetworkKarma());
    }
}
