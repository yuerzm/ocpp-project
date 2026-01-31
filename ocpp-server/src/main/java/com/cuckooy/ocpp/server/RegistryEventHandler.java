package com.cuckooy.ocpp.server;

import com.cuckooy.ocpp.server.registry.ChargePointRegistry;

public interface RegistryEventHandler {

    ChargePointRegistry retrieve(String identity);

    boolean validate(String identity);

}
