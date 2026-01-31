package com.cuckooy.ocpp.v21.model.common.enumerations;

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
     * Sign charging station certificate message trigger enum type.
     */
    SignChargingStationCertificate("SignChargingStationCertificate"),

    /**
     * Sign v 2 g certificate message trigger enum type.
     */
    SignV2GCertificate("SignV2GCertificate"),

    /**
     * Status notification message trigger enum type.
     */
    StatusNotification("StatusNotification"),

    /**
     * Transaction event message trigger enum type.
     */
    TransactionEvent("TransactionEvent"),

    /**
     * Sign combined certificate message trigger enum type.
     */
    SignCombinedCertificate("SignCombinedCertificate"),

    /**
     * Publish firmware status notification message trigger enum type.
     */
    PublishFirmwareStatusNotification("PublishFirmwareStatusNotification"),

    /**
     * Sign v 2 g 20 certificate message trigger enum type.
     */
    SignV2G20Certificate("SignV2G20Certificate"),
    /**
     * Custom trigger message trigger enum type.
     */
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
