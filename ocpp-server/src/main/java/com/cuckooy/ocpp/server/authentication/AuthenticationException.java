package com.cuckooy.ocpp.server.authentication;

public abstract class AuthenticationException extends RuntimeException {

    public AuthenticationException(String message) {
        super(message);
    }
}
