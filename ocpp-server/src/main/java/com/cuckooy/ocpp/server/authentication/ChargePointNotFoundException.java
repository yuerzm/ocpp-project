package com.cuckooy.ocpp.server.authentication;

public class ChargePointNotFoundException extends AuthenticationException {

    public ChargePointNotFoundException(String message) {
        super(message);
    }
}
