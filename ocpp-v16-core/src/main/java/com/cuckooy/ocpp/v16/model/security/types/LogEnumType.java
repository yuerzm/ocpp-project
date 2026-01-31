package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Log enum type.
 */
public enum LogEnumType {

    /**
     * Diagnostics log log enum type.
     */
    DiagnosticsLog("DiagnosticsLog"),
    /**
     * Security log log enum type.
     */
    SecurityLog("SecurityLog");

    private final String value;

    LogEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
