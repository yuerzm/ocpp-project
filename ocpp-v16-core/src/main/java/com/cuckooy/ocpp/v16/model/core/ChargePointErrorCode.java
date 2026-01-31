package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Charge point error code.
 */
public enum ChargePointErrorCode {

    /**
     * Connector lock failure charge point error code.
     */
    ConnectorLockFailure("ConnectorLockFailure"),

    /**
     * Ev communication error charge point error code.
     */
    EVCommunicationError("EVCommunicationError"),

    /**
     * Ground failure charge point error code.
     */
    GroundFailure("GroundFailure"),

    /**
     * High temperature charge point error code.
     */
    HighTemperature("HighTemperature"),

    /**
     * Internal error charge point error code.
     */
    InternalError("InternalError"),

    /**
     * Local list conflict charge point error code.
     */
    LocalListConflict("LocalListConflict"),

    /**
     * No error charge point error code.
     */
    NoError("NoError"),

    /**
     * Other error charge point error code.
     */
    OtherError("OtherError"),

    /**
     * Over current failure charge point error code.
     */
    OverCurrentFailure("OverCurrentFailure"),

    /**
     * Over voltage charge point error code.
     */
    OverVoltage("OverVoltage"),

    /**
     * Power meter failure charge point error code.
     */
    PowerMeterFailure("PowerMeterFailure"),

    /**
     * Power switch failure charge point error code.
     */
    PowerSwitchFailure("PowerSwitchFailure"),

    /**
     * Reader failure charge point error code.
     */
    ReaderFailure("ReaderFailure"),

    /**
     * Reset failure charge point error code.
     */
    ResetFailure("ResetFailure"),

    /**
     * Under voltage charge point error code.
     */
    UnderVoltage("UnderVoltage"),

    /**
     * Weak signal charge point error code.
     */
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