package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Charge point registry repository.
 */
public interface ChargePointRegistryRepository {

    /**
     * Find charge point registry.
     *
     * @param identity the identity
     * @return the charge point registry
     */
    ChargePointRegistry find(String identity);

}
