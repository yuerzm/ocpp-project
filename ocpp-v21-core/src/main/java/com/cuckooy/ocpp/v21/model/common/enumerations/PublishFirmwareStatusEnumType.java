package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum PublishFirmwareStatusEnumType {

    Idle("Idle"),

    DownloadScheduled("DownloadScheduled"),

    Downloading("Downloading"),

    Downloaded("Downloaded"),

    Published("Published"),

    DownloadFailed("DownloadFailed"),

    DownloadPaused("DownloadPaused"),

    InvalidChecksum("InvalidChecksum"),

    ChecksumVerified("ChecksumVerified"),

    PublishFailed("PublishFailed");

    private final String value;

    PublishFirmwareStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
