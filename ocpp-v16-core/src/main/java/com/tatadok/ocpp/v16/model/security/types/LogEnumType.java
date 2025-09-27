package com.tatadok.ocpp.v16.model.security.types;

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
