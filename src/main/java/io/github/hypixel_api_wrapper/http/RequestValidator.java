package io.github.hypixel_api_wrapper.http;

import io.github.hypixel_api_wrapper.exception.ForbiddenAccessException;
import io.github.hypixel_api_wrapper.exception.GuildNotFoundException;
import io.github.hypixel_api_wrapper.exception.KeyThrottleException;
import io.github.hypixel_api_wrapper.exception.InvalidDataException;
import io.github.hypixel_api_wrapper.exception.MissingFieldException;
import io.github.hypixel_api_wrapper.exception.PlayerNotFoundException;
import io.github.hypixel_api_wrapper.exception.UnknownAPIException;
import java.io.IOException;
import okhttp3.Response;
import org.json.JSONObject;

public class RequestValidator {

    public static boolean isValid(Response response) {
        try {
            JSONObject returnObject = new JSONObject(response.body().string());
            if (response.isSuccessful()) {
                if (returnObject.isNull("player")) {
                    throw new PlayerNotFoundException("Player not found.");
                } else if (returnObject.isNull("guild")) {
                    throw new GuildNotFoundException("Guild not found.");
                } else {
                    return true;
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

