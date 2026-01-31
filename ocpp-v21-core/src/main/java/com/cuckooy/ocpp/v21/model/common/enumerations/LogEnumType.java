package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    SecurityLog("SecurityLog"),
    /**
     * Data collector log log enum type.
     */
    DataCollectorLog("DataCollectorLog"),
    ;

    private final String value;

    LogEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
