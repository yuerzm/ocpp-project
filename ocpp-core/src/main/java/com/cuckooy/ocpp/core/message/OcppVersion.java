package com.cuckooy.ocpp.core.message;

import lombok.Getter;

@Getter
public enum OcppVersion {

    V_12("ocpp1.2"),
    V_15("ocpp1.5"),
    V_16("ocpp1.6"),
    V_20("ocpp2.0"),
    V_201("ocpp2.0.1"),
    V_21("ocpp2.1");

    private final String value;

    OcppVersion(String value) {
        this.value = value;
    }

    public static OcppVersion fromValue(String value) {
        for (OcppVersion version : OcppVersion.values()) {
            if (version.getValue().equals(value)) {
                return version;
            }
        }
        throw new IllegalArgumentException(value);
    }

    public OcppProtocol toProtocol(OcppTransport transport) {
        for (OcppProtocol value : OcppProtocol.values()) {
            if (value.getVersion() == this && value.getTransport() == transport) {
                return value;
            }
        }
        throw new IllegalArgumentException("Could not find OcppProtocol for " + transport);
    }
}