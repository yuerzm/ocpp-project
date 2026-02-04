package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Authentication event handler.
 */
public interface AuthenticationEventHandler {

    /**
     * Retrieve charge point retrieve response.
     *
     * @param request the request
     * @return the charge point retrieve response
     */
    ChargePointRetrieveResponse retrieve(ChargePointRetrieveRequest request);

}
