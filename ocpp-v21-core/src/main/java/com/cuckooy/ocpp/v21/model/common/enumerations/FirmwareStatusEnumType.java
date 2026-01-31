package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Firmware status enum type.
 */
public enum FirmwareStatusEnumType {

    /**
     * Downloaded firmware status enum type.
     */
    Downloaded("Downloaded"),
    /**
     * Download failed firmware status enum type.
     */
    DownloadFailed("DownloadFailed"),
    /**
     * Downloading firmware status enum type.
     */
    Downloading("Downloading"),
    /**
     * Download scheduled firmware status enum type.
     */
    DownloadScheduled("DownloadScheduled"),
    /**
     * Download paused firmware status enum type.
     */
    DownloadPaused("DownloadPaused"),
    /**
     * Idle firmware status enum type.
     */
    Idle("Idle"),
    /**
     * Installation failed firmware status enum type.
     */
    InstallationFailed("InstallationFailed"),
    /**
     * Installing firmware status enum type.
     */
    Installing("Installing"),
    /**
     * Installed firmware status enum type.
     */
    Installed("Installed"),
    /**
     * Install rebooting firmware status enum type.
     */
    InstallRebooting("InstallRebooting"),
    /**
     * Install scheduled firmware status enum type.
     */
    InstallScheduled("InstallScheduled"),
    /**
     * Install verification failed firmware status enum type.
     */
    InstallVerificationFailed("InstallVerificationFailed"),
    /**
     * Invalid signature firmware status enum type.
     */
    InvalidSignature("InvalidSignature"),
    /**
     * Signature verified firmware status enum type.
     */
    SignatureVerified("SignatureVerified");

    private final String value;

    FirmwareStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
