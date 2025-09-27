package com.tatadok.ocpp.v16.model.smartcharging;

public enum ChargingProfileStatus {

    Accepted("Accepted"),

    Rejected("Rejected"),

    NotSupported("NotSupported");

    private final String value;

    ChargingProfileStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
