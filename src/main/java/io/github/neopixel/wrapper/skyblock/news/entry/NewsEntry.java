package io.github.neopixel.wrapper.skyblock.news.entry;

import io.github.neopixel.wrapper.util.JSONHandler;

public class NewsEntry {

    private final JSONHandler jsonHandler;

    public NewsEntry(JSONHandler jsonHandler) {
        this.jsonHandler = jsonHandler;
    }

    /**
     * @return The title of the update. (Ex. SkyBlock v0.16.1)
     */
    public String getTitle() {
        return jsonHandler.getSafeString("title");
    }

    /**
     * @return The text of the update. (Ex. 9th November 2022)
     */
    public String getText() {
        return jsonHandler.getSafeString("text");
    }

    /**
     * @return The forums post link for the update. (Ex. <a href="https://hypixel.net/threads/5164540/">https://hypixel.net/threads/5164540/</a>)
     */
    public String getLink() {
        return jsonHandler.getSafeString("link");
    }
}