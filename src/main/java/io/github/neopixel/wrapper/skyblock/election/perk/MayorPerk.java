package io.github.neopixel.wrapper.skyblock.election.perk;

import io.github.neopixel.wrapper.util.JSONHandler;

public class MayorPerk {

    private final JSONHandler jsonHandler;

    public MayorPerk(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    /**
     * @return The name of the perk. (Ex. Mining XP Buff)
     */
    public String getName() {
        return jsonHandler.getSafeString("name");
    }

    /**
     * @return The description of the perk. (Ex. Get §3+60☯ Mining Wisdom §7on public islands.)
     */
    public String getDescription() {
        return jsonHandler.getSafeString("description");
    }
}