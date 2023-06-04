package io.github.neopixel.wrapper.skyblock;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.guild.HypixelGuildMember;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONArray;
import org.json.JSONObject;

public class SkyblockNews {

    private final RequestController requestController;
    private final JSONHandler jsonHandler;

    public SkyblockNews(RequestController requestController) {
        this.requestController = requestController;
        this.jsonHandler = requestController.getSkyblockNews();
    }

    /**
     * @return A list of all current news with the most recent news at the start of the list.
     * @see NewsEntry
     */
    public List<NewsEntry> getNews() {
        return jsonHandler.getSafeJSONArray("items").toList().stream().map(newsObject -> {
            JSONHandler playerJSONHandler = new JSONHandler((JSONObject) JSONObject.wrap(newsObject));
            return new NewsEntry(playerJSONHandler);
        }).collect(Collectors.toList());
    }

    public static class NewsEntry {

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
}
