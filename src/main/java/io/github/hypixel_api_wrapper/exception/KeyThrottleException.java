package io.github.hypixel_api_wrapper.exception;

/**
 * A request limit has been reached, usually this is due to the limit on the key being reached but
 * can also be triggered by a global throttle.
 */
public class KeyThrottleException extends NeopixelException {

    public KeyThrottleException(String message) {
        super(message);
    }
}
