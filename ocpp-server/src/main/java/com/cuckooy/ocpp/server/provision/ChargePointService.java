package com.cuckooy.ocpp.server.provision;

public interface ChargePointService {

    default boolean validate(String input) {
        return true;
    }

    default boolean checkChargePoint(String identity) {
        return true;
    }
}
