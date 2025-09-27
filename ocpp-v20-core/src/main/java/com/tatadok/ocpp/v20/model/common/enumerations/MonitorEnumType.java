package com.tatadok.ocpp.v20.model.common.enumerations;

public enum MonitorEnumType {

    UpperThreshold("UpperThreshold"),

    LowerThreshold("LowerThreshold"),

    Delta("Delta"),

    Periodic("Periodic"),

    PeriodicClockAligned("PeriodicClockAligned");

    private final String value;

    MonitorEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
