package io.quarkus.panache.common.exception;

public class PanacheQueryException extends RuntimeException {
    public PanacheQueryException(String s) {
        super(s);
    }

    public PanacheQueryException(String s, Throwable cause) {
        super(s, cause);
    }
}
