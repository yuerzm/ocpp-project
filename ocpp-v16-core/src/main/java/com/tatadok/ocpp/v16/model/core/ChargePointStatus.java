package com.tatadok.ocpp.v16.model.core;

public enum ChargePointStatus {

    Available("Available"),
    Preparing("Preparing"),
    Charging("Charging"),
    SuspendedEVSE("SuspendedEVSE"),
    SuspendedEV("SuspendedEV"),
    Finishing("Finishing"),
    Reserved("Reserved"),
    Unavailable("Unavailable"),
    Faulted("Faulted");

    private final String value;

    ChargePointStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
