package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Boot reason enum type.
 */
public enum BootReasonEnumType {

    /**
     * Application reset boot reason enum type.
     */
    ApplicationReset("ApplicationReset"),

    /**
     * Firmware update boot reason enum type.
     */
    FirmwareUpdate("FirmwareUpdate"),

    /**
     * Local reset boot reason enum type.
     */
    LocalReset("LocalReset"),

    /**
     * Power up boot reason enum type.
     */
    PowerUp("PowerUp"),

    /**
     * Remote reset boot reason enum type.
     */
    RemoteReset("RemoteReset"),

    /**
     * Scheduled reset boot reason enum type.
     */
    ScheduledReset("ScheduledReset"),

    /**
     * Triggered boot reason enum type.
     */
    Triggered("Triggered"),

    /**
     * Unknown boot reason enum type.
     */
    Unknown("Unknown"),

    /**
     * Watchdog boot reason enum type.
     */
    Watchdog("Watchdog");

    private final String value;

    BootReasonEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
