package com.cuckooy.ocpp.v16.model.remotetrigger;

/**
 * The enum Message trigger.
 */
public enum MessageTrigger {

    /**
     * Boot notification message trigger.
     */
    BootNotification("BootNotification"),

    /**
     * Diagnostics status notification message trigger.
     */
    DiagnosticsStatusNotification("DiagnosticsStatusNotification"),

    /**
     * Firmware status notification message trigger.
     */
    FirmwareStatusNotification("FirmwareStatusNotification"),

    /**
     * Heartbeat message trigger.
     */
    Heartbeat("Heartbeat"),

    /**
     * Meter values message trigger.
     */
    MeterValues("MeterValues"),

    /**
     * Status notification message trigger.
     */
    StatusNotification("StatusNotification");

    private final String value;

    MessageTrigger(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
