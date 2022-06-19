package com.insertign.pineapple.util;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Endpoints {
    private static final JSONObject obj;
    private static final JSONObject endpoints;
    private static final String baseEndpoint;
    private static final Endpoints e = new Endpoints();
    static {
        try {
            StringBuilder out = new StringBuilder();
            InputStream is = e.getClass().getClassLoader().getResourceAsStream("endpoints.json");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                out.append(line);
            }
            obj = new JSONObject(out.toString());
            baseEndpoint = obj.getString("base_endpoint");
            endpoints = obj.getJSONObject("endpoints");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getBoostersEndpoint(String key) {
        return String.format(baseEndpoint + endpoints.getString("boosters_endpoint"), key);
    }
    public static String getGuildByNameEndpoint(String key, String name) {
        return String.format(baseEndpoint + endpoints.getString("find_guild_endpoint"), key, name);
    }
    public static String getGuildByPlayerEndpoint(String key, String player) {
        return String.format(baseEndpoint + endpoints.getString("find_guild_by_player_endpoint"), key, player);
    }
    public static String getFriendsEndpoint(String key, String uuid) {
        return String.format(baseEndpoint + endpoints.getString("friends_endpoint"), key, uuid);
    }
    public static String getGuildEndpoint(String key, String id) {
        return String.format(baseEndpoint + endpoints.getString("guilds_endpoint"), id);
    }
    public static String getKeyEndpoint(String key) {
        return String.format(baseEndpoint + endpoints.getString("key_endpoint"), key);
    }
    public static String getLeaderboardsEndpoint(String key) {
        return String.format(baseEndpoint + endpoints.getString("leaderboards_endpoint"), key);
    }
    public static String getPlayerByNameEndpoint(String key, String name) {
        return String.format(baseEndpoint + endpoints.getString("find_player_by_name"), key, name);
    }
    public static String getPlayerByUUIDEndpoint(String key, String uuid) {
        return String.format(baseEndpoint + endpoints.getString("find_player_by_uuid"), key, uuid);
    }
    public static String getPlayerCountEndpoint(String key) {
        return String.format(baseEndpoint + endpoints.getString("player_count_endpoint"), key);
    }
    public static String getSessionEndpoint(String key, String uuid) {
        return String.format(baseEndpoint + endpoints.getString("session_endpoint"), key, uuid);
    }
    public static String getWatchdogEndpoint(String key) {
        return String.format(baseEndpoint + endpoints.getString("watchdogstats?key=%s"), key);
    }
    public static String getStatusEndpoint(String key, String uuid) {
        return String.format(baseEndpoint + endpoints.getString("status?key=%s&uuid=%s"), key, uuid);
    }
    public static String getRecentGamesEndpoint(String key, String uuid) {
        return String.format(baseEndpoint + endpoints.getString("recentGames?key=%s&uuid=%s"), key, uuid);
    }
    public static String getGameCountsEndpoints(String key) {
        return String.format(baseEndpoint + endpoints.getString("gameCounts?key=%s"), key);
    }

}