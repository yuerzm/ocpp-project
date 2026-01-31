package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Message trigger enum type.
 */
public enum MessageTriggerEnumType {

    /**
     * Boot notification message trigger enum type.
     */
    BootNotification("BootNotification"),
    /**
     * Log status notification message trigger enum type.
     */
    LogStatusNotification("LogStatusNotification"),
    /**
     * Firmware status notification message trigger enum type.
     */
    FirmwareStatusNotification("FirmwareStatusNotification"),
    /**
     * Heartbeat message trigger enum type.
     */
    Heartbeat("Heartbeat"),
    /**
     * Meter values message trigger enum type.
     */
    MeterValues("MeterValues"),
    /**
     * Sign charge point certificate message trigger enum type.
     */
    SignChargePointCertificate("SignChargePointCertificate"),
    /**
     * Status notification message trigger enum type.
     */
    StatusNotification("StatusNotification");

    private final String value;

    MessageTriggerEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
