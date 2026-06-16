package com.cuckooy.ocpp.server.authentication;

public class ChargePointBadCredentialException extends AuthenticationException {

    public ChargePointBadCredentialException(String message) {
        super(message);
    }
}
