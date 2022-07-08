package io.github.hypixel_api_wrapper.wrapper.guild;

import io.github.hypixel_api_wrapper.wrapper.player.HypixelPlayer;
import java.util.List;

public class HypixelGuild {
    private String name;
    private String APIKey;

    public HypixelGuild(String name, String APIKey) {
        this.name = name;
        this.APIKey = APIKey;
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
    public long getDailyGXP() {
        return 0;
    }
}
