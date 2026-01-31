package com.cuckooy.ocpp.core.message;

import lombok.Getter;

/**
 * The enum Ocpp version.
 */
@Getter
public enum OcppVersion {

    /**
     * V 12 ocpp version.
     */
    V_12("ocpp1.2"),
    /**
     * V 15 ocpp version.
     */
    V_15("ocpp1.5"),
    /**
     * V 16 ocpp version.
     */
    V_16("ocpp1.6"),
    /**
     * V 201 ocpp version.
     */
    V_201("ocpp2.0.1"),
    /**
     * V 21 ocpp version.
     */
    V_21("ocpp2.1");

    private final String value;

    OcppVersion(String value) {
        this.value = value;
    }

    /**
     * From value ocpp version.
     *
     * @param value the value
     * @return the ocpp version
     */
    public static OcppVersion fromValue(String value) {
        for (OcppVersion version : OcppVersion.values()) {
            if (version.getValue().equals(value)) {
                return version;
            }
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * To protocol ocpp protocol.
     *
     * @param transport the transport
     * @return the ocpp protocol
     */
    public OcppProtocol toProtocol(OcppTransport transport) {
        for (OcppProtocol value : OcppProtocol.values()) {
            if (value.getVersion() == this && value.getTransport() == transport) {
                return value;
            }
        }
        throw new IllegalArgumentException("Could not find OcppProtocol for " + transport);
    }
}