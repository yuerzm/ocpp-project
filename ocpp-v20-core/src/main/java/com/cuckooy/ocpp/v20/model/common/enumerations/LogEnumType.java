package com.cuckooy.ocpp.v20.model.common.enumerations;

public enum LogEnumType {

    DiagnosticsLog("DiagnosticsLog"),

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
