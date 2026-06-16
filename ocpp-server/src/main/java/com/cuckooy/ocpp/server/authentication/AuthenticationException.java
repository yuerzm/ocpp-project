package com.cuckooy.ocpp.server.authentication;

/**
 * The type Authentication exception.
 */
public abstract class AuthenticationException extends RuntimeException {

    /**
     * Instantiates a new Authentication exception.
     *
     * @param message the message
     */
    public AuthenticationException(String message) {
        super(message);
    }
}
