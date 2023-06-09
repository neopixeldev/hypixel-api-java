package io.github.neopixel.wrapper.skyblock.news;

import io.github.neopixel.http.RequestController;
import io.github.neopixel.wrapper.skyblock.news.entry.NewsEntry;
import io.github.neopixel.wrapper.util.JSONHandler;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class SkyblockNews {

    private final JSONHandler jsonHandler;

    public SkyblockNews(RequestController requestController) {
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
}
