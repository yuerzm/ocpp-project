package com.cuckooy.ocpp.server.authentication;

/**
 * The type Charge point not found exception.
 */
public class ChargePointNotFoundException extends AuthenticationException {

    /**
     * Instantiates a new Charge point not found exception.
     *
     * @param message the message
     */
    public ChargePointNotFoundException(String message) {
        super(message);
    }
}
