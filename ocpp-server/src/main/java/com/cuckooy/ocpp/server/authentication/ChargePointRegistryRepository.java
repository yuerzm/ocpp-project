package com.cuckooy.ocpp.server.authentication;

public interface ChargePointRegistryRepository {

    ChargePointRegistry find(String identity);

}
