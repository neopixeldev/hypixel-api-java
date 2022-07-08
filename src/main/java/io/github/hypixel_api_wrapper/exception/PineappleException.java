package io.github.hypixel_api_wrapper.exception;

public class PineappleException extends RuntimeException {
    private final String message;
    public PineappleException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
    @Override
    public String toString() {
        return "PineappleException{" +
                "message='" + message + '\'' +
                '}';
    }
}
