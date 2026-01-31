package com.cuckooy.ocpp.server;

import com.cuckooy.ocpp.server.registry.ChargePointRegistry;

public interface RegistryEventHandler {

    default ChargePointRegistry retrieve(String identity) {
        return null;
    }

    default boolean validate(String identity) {
        return true;
    }

    default boolean check(String identity) {
        return true;
    }
}
