package com.cuckooy.ocpp.server.provision;

public interface RegistryEventHandler {

    default boolean validate(String identity) {
        return true;
    }

    default boolean check(String identity) {
        return true;
    }
}
