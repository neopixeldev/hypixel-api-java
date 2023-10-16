package io.github.neopixel.wrapper.skyblock.player.pet;

import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.UUID;

public class SkyblockPet {

    private final JSONHandler jsonHandler;

    public SkyblockPet(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public UUID getUUID() {
        return jsonHandler.getSafeUUID("uuid");
    }

    // TODO: Pet enum
    public String getType() {
        return jsonHandler.getSafeString("type");
    }

    public Float getExp() {
        return jsonHandler.getSafeFloat("exp");
    }

    public Boolean isActive() {
        return jsonHandler.getSafeBoolean("active");
    }

    public String getTier() {
        // TODO: implement global enum for rarity skyblock
        return jsonHandler.getSafeString("tier");
    }

    public String getHeldItem() {
        return jsonHandler.getSafeString("heldItem");
    }

    public int getCandyUsed() {
        return jsonHandler.getSafeInt("candyUsed");
    }
}