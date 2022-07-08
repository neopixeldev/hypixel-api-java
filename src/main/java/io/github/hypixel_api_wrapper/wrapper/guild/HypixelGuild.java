package io.github.hypixel_api_wrapper.wrapper.guild;

import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.util.List;

public class HypixelGuild {
    private String name;
    private String apiKey;

    public HypixelGuild(String name, String apiKey) {
        this.name = name;
        this.apiKey = apiKey;
    }

    public String getName() {
        return name;
    }
    public List<HypixelPlayer> getMembers() {
        return null;
    }
    public HypixelPlayer getOwner() {
        return null;
    }
    public long getDailyGEXP() {
        return 0;
    }
}
