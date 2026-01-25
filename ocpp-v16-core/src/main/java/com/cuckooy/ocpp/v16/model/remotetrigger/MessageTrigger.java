package com.cuckooy.ocpp.v16.model.remotetrigger;

public enum MessageTrigger {

    BootNotification("BootNotification"),

    DiagnosticsStatusNotification("DiagnosticsStatusNotification"),

    FirmwareStatusNotification("FirmwareStatusNotification"),

    Heartbeat("Heartbeat"),

    MeterValues("MeterValues"),

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
