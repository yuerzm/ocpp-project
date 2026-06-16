package com.cuckooy.ocpp.server.authentication;

/**
 * The type Charge point bad credential exception.
 */
public class ChargePointBadCredentialException extends AuthenticationException {

    /**
     * Instantiates a new Charge point bad credential exception.
     *
     * @param message the message
     */
    public ChargePointBadCredentialException(String message) {
        super(message);
    }
}
