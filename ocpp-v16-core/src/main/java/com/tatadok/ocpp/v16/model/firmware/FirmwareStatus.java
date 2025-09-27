package com.tatadok.ocpp.v16.model.firmware;

public enum FirmwareStatus {

    Downloaded("Downloaded"),

    DownloadFailed("DownloadFailed"),

    Downloading("Downloading"),

    Idle("Idle"),

    InstallationFailed("InstallationFailed"),

    Installing("Installing"),

    Installed("Installed");

    private final String value;

    FirmwareStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
