package com.cuckooy.ocpp.v16.model.firmware;

/**
 * The enum Firmware status.
 */
public enum FirmwareStatus {

    /**
     * Downloaded firmware status.
     */
    Downloaded("Downloaded"),

    /**
     * Download failed firmware status.
     */
    DownloadFailed("DownloadFailed"),

    /**
     * Downloading firmware status.
     */
    Downloading("Downloading"),

    /**
     * Idle firmware status.
     */
    Idle("Idle"),

    /**
     * Installation failed firmware status.
     */
    InstallationFailed("InstallationFailed"),

    /**
     * Installing firmware status.
     */
    Installing("Installing"),

    /**
     * Installed firmware status.
     */
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
