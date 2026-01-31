package com.cuckooy.ocpp.server;

import com.cuckooy.ocpp.server.registry.ChargePointRegistry;

/**
 * The interface Registry event handler.
 */
public interface RegistryEventHandler {

    /**
     * Retrieve charge point registry.
     *
     * @param identity the identity
     * @return the charge point registry
     */
    ChargePointRegistry retrieve(String identity);

    /**
     * Validate boolean.
     *
     * @param identity the identity
     * @return the boolean
     */
    boolean validate(String identity);

}
