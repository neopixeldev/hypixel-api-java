package io.github.hypixel_api_wrapper.http;

import com.insertign.pineapple.exception.*;
import io.github.hypixel_api_wrapper.exception.GuildNotFoundException;
import io.github.hypixel_api_wrapper.exception.InvalidAPIKeyException;
import io.github.hypixel_api_wrapper.exception.KeyThrottleException;
import io.github.hypixel_api_wrapper.exception.MalformedUUIDException;
import io.github.hypixel_api_wrapper.exception.PlayerNotFoundException;
import io.github.hypixel_api_wrapper.exception.UnknownAPIException;
import org.json.JSONObject;

public class RequestValidator {
    public static boolean isValid(JSONObject obj) {
        if(!obj.getBoolean("success")) {
            switch(obj.getString("cause")) {
                case "Malformed UUID":
                    throw new MalformedUUIDException("Invalid UUID provided.");
                case "Invalid API key":
                    throw new InvalidAPIKeyException("Invalid API key provided");
                case "Key throttle":
                    throw new KeyThrottleException("Exceeded 120 requests/minute to the API.");
                default:
                    throw new UnknownAPIException("An unknown error has occurred.");
            }
        } else if(obj.isNull("player")) {
            throw new PlayerNotFoundException("Player not found.");
        } else if(obj.isNull("guild")) {
            throw new GuildNotFoundException("Guild not found.");
        } else {
            return true;
        }
    }
}
