package com.tatadok.ocpp.v20.model.common.enumerations;

public enum BootReasonEnumType {

    ApplicationReset("ApplicationReset"),

    FirmwareUpdate("FirmwareUpdate"),

    LocalReset("LocalReset"),

    PowerUp("PowerUp"),

    RemoteReset("RemoteReset"),

    ScheduledReset("ScheduledReset"),

    Triggered("Triggered"),

    Unknown("Unknown"),

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
