package io.github.neopixel.http.query;

/**
 * Keeps track of the parameters passed into the {@link Query} constructor.
 * @param type  The type of the parameter being passed in.
 * @param value The value of the parameter being passed in.
 */
public record QueryParameter(HypixelQueryParameterTypes type, String value) {

}
