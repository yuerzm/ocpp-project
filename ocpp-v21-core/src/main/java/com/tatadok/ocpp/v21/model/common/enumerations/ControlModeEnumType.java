package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ControlModeEnumType {

    ScheduledControl("ScheduledControl"),
    DynamicControl("DynamicControl"),
    ;

    private final String value;

    ControlModeEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
