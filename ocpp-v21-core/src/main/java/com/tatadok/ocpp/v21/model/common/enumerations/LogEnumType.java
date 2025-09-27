package com.tatadok.ocpp.v21.model.common.enumerations;

public enum LogEnumType {

    DiagnosticsLog("DiagnosticsLog"),
    SecurityLog("SecurityLog"),
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
