package com.tatadok.ocpp.v16.model.security.types;

public enum MessageTriggerEnumType {

    BootNotification("BootNotification"),
    LogStatusNotification("LogStatusNotification"),
    FirmwareStatusNotification("FirmwareStatusNotification"),
    Heartbeat("Heartbeat"),
    MeterValues("MeterValues"),
    SignChargePointCertificate("SignChargePointCertificate"),
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
