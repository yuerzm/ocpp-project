package com.cuckooy.ocpp.v16.model.core;

public enum ChargePointErrorCode {

    ConnectorLockFailure("ConnectorLockFailure"),

    EVCommunicationError("EVCommunicationError"),

    GroundFailure("GroundFailure"),

    HighTemperature("HighTemperature"),

    InternalError("InternalError"),

    LocalListConflict("LocalListConflict"),

    NoError("NoError"),

    OtherError("OtherError"),

    OverCurrentFailure("OverCurrentFailure"),

    OverVoltage("OverVoltage"),

    PowerMeterFailure("PowerMeterFailure"),

    PowerSwitchFailure("PowerSwitchFailure"),

    ReaderFailure("ReaderFailure"),

    ResetFailure("ResetFailure"),

    UnderVoltage("UnderVoltage"),

    WeakSignal("WeakSignal");

    private final String value;

    ChargePointErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}