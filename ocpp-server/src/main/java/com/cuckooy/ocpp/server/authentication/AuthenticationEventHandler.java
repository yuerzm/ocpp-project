package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Authentication event handler.
 */
public interface AuthenticationEventHandler {

    /**
     * Authenticate charge point authenticate response.
     *
     * @param request the request
     * @return the charge point authenticate response
     */
    ChargePointAuthenticateResponse authenticate(ChargePointAuthenticateRequest request);

}
