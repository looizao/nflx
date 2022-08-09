package com.looizao.domain.exceptions;

public class NoStacktraceException extends RuntimeException {

    public NoStacktraceException(String message) {
        super(message, null);
    }

    public NoStacktraceException(String message, Throwable cause) {
        super(message, cause, true, false);
    }
}
