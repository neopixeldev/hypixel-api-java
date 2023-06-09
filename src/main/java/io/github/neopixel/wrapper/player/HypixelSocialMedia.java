package io.github.neopixel.wrapper.player;

import io.github.neopixel.wrapper.util.JSONHandler;

/**
 * TODO: Write class description here
 *
 * @author Nopox
 * @project neopixel
 * @since 6/8/2023
 */
public class HypixelSocialMedia {

    private final JSONHandler jsonHandler;

    public HypixelSocialMedia(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler.getJSONHandler("links");
    }

    public String getDiscord() {
        return jsonHandler.getSafeString("DISCORD");
    }

    public String getTwitter() {
        return jsonHandler.getSafeString("TWITTER");
    }

    public String getYoutube() {
        return jsonHandler.getSafeString("YOUTUBE");
    }

    public String getInstagram() {
        return jsonHandler.getSafeString("INSTAGRAM");
    }

    public String getTwitch() {
        return jsonHandler.getSafeString("TWITCH");
    }
}
