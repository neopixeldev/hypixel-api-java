package io.github.neopixel.wrapper.skyblock.player.bank;

import io.github.neopixel.wrapper.util.JSONHandler;

public class ProfileBank {

    private final JSONHandler jsonHandler;

    public ProfileBank(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    public Float getBalance() {
        return jsonHandler.getSafeFloat("balance");
    }
}