package com.tatadok.ocpp.v20.model.common.enumerations;

public enum MonitoringBaseEnumType {

    All("All"),
    FactoryDefault("FactoryDefault"),
    HardWiredOnly("HardWiredOnly");

    private final String value;

    MonitoringBaseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
