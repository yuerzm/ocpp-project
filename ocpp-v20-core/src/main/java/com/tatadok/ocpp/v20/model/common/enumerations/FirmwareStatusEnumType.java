package com.tatadok.ocpp.v20.model.common.enumerations;

public enum FirmwareStatusEnumType {

    Downloaded("Downloaded"),
    DownloadFailed("DownloadFailed"),
    Downloading("Downloading"),
    DownloadScheduled("DownloadScheduled"),
    DownloadPaused("DownloadPaused"),
    Idle("Idle"),
    InstallationFailed("InstallationFailed"),
    Installing("Installing"),
    Installed("Installed"),
    InstallRebooting("InstallRebooting"),
    InstallScheduled("InstallScheduled"),
    InstallVerificationFailed("InstallVerificationFailed"),
    InvalidSignature("InvalidSignature"),
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
