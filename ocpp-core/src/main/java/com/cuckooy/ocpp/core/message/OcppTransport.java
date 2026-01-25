package com.cuckooy.ocpp.core.message;

import lombok.Getter;

@Getter
public enum OcppTransport {

    SOAP("S"),  // HTTP with SOAP payloads
    JSON("J");  // WebSocket with JSON payloads

    private final String value;

    OcppTransport(String value) {
        this.value = value;
    }

    public static OcppTransport fromValue(String value) {
        for (OcppTransport transport : OcppTransport.values()) {
            if (transport.getValue().equals(value)) {
                return transport;
            }
        }
        throw new IllegalArgumentException(value);
    }

    public static OcppTransport fromName(String name) {
        for (OcppTransport transport : OcppTransport.values()) {
            if (transport.name().equals(name)) {
                return transport;
            }
        }
        throw new IllegalArgumentException(name);
    }
}
