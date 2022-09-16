package io.github.neopixel.http;

import io.github.neopixel.exception.ForbiddenAccessException;
import io.github.neopixel.exception.GuildNotFoundException;
import io.github.neopixel.exception.KeyThrottleException;
import io.github.neopixel.exception.InvalidDataException;
import io.github.neopixel.exception.MissingFieldException;
import io.github.neopixel.exception.PlayerNotFoundException;
import io.github.neopixel.exception.UnknownAPIException;
import okhttp3.Response;
import org.json.JSONObject;

public class RequestValidator {

    public static boolean isValid(Response response, JSONObject returnObject) {
        if (response.isSuccessful()) {
            if (!returnObject.isNull("player") || !returnObject.isNull("guild")) {
                return true;
            } else if (returnObject.isNull("player")) {
                throw new PlayerNotFoundException("Player not found.");
            } else if (returnObject.isNull("guild")) {
                throw new GuildNotFoundException("Guild not found.");
            }
        } else {

            String failString = returnObject.getString("cause");

            switch (response.code()) {
                case 400:
                    throw new MissingFieldException(failString);
                case 403:
                    throw new ForbiddenAccessException(failString);
                case 422:
                    throw new InvalidDataException(failString);
                case 429:
                    throw new KeyThrottleException(failString);
                default:
                    throw new UnknownAPIException(failString);
            }
        }
        return false;
    }

}

