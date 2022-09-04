package io.github.hypixel_api_wrapper.exception;

public class NovopixelException extends RuntimeException {

    private final String message;

    public NovopixelException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "NovopixelException{" +
            "message='" + message + '\'' +
            '}';
    }
}
