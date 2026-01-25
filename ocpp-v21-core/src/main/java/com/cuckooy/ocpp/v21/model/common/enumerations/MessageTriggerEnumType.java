package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum MessageTriggerEnumType {

    BootNotification("BootNotification"),

    LogStatusNotification("LogStatusNotification"),

    FirmwareStatusNotification("FirmwareStatusNotification"),

    Heartbeat("Heartbeat"),

    MeterValues("MeterValues"),

    SignChargingStationCertificate("SignChargingStationCertificate"),

    SignV2GCertificate("SignV2GCertificate"),

    StatusNotification("StatusNotification"),

    TransactionEvent("TransactionEvent"),

    SignCombinedCertificate("SignCombinedCertificate"),

    PublishFirmwareStatusNotification("PublishFirmwareStatusNotification"),

    SignV2G20Certificate("SignV2G20Certificate"),
    CustomTrigger("CustomTrigger"),
    ;

    private final String value;

    MessageTriggerEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
