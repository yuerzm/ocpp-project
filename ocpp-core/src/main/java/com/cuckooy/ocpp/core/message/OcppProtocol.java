package com.cuckooy.ocpp.core.message;

import lombok.Getter;

/**
 * The enum Ocpp protocol.
 */
@Getter
public enum OcppProtocol {

    /**
     * V 12 soap ocpp protocol.
     */
    V_12_SOAP(OcppVersion.V_12, OcppTransport.SOAP),
    /**
     * V 12 json ocpp protocol.
     */
    V_12_JSON(OcppVersion.V_12, OcppTransport.JSON),

    /**
     * V 15 soap ocpp protocol.
     */
    V_15_SOAP(OcppVersion.V_15, OcppTransport.SOAP),
    /**
     * V 15 json ocpp protocol.
     */
    V_15_JSON(OcppVersion.V_15, OcppTransport.JSON),

    /**
     * V 16 soap ocpp protocol.
     */
    V_16_SOAP(OcppVersion.V_16, OcppTransport.SOAP),
    /**
     * V 16 json ocpp protocol.
     */
    V_16_JSON(OcppVersion.V_16, OcppTransport.JSON),

    /**
     * V 201 soap ocpp protocol.
     */
    V_201_SOAP(OcppVersion.V_201, OcppTransport.SOAP),
    /**
     * V 201 json ocpp protocol.
     */
    V_201_JSON(OcppVersion.V_201, OcppTransport.JSON),

    /**
     * V 21 soap ocpp protocol.
     */
    V_21_SOAP(OcppVersion.V_21, OcppTransport.SOAP),
    /**
     * V 21 json ocpp protocol.
     */
    V_21_JSON(OcppVersion.V_21, OcppTransport.JSON);

    private final OcppVersion version;
    private final OcppTransport transport;

    OcppProtocol(OcppVersion version, OcppTransport transport) {
        this.version = version;
        this.transport = transport;
    }

    /**
     * Gets composite value.
     *
     * @return the composite value
     */
    public String getCompositeValue() {
        return version.getValue() + transport.getValue();
    }

    /**
     * From composite value ocpp protocol.
     *
     * @param value the value
     * @return the ocpp protocol
     */
    public static OcppProtocol fromCompositeValue(String value) {
        int splitIndex = value.length() - 1;

        String version = value.substring(0, splitIndex);
        String transport = String.valueOf(value.charAt(splitIndex));

        OcppVersion ocppVersion = OcppVersion.fromValue(version);
        OcppTransport ocppTransport = OcppTransport.fromValue(transport);

        for (OcppProtocol protocol : OcppProtocol.values()) {
            if (protocol.getVersion() == ocppVersion && protocol.getTransport() == ocppTransport) {
                return protocol;
            }
        }

        throw new IllegalArgumentException(value);
    }
}
