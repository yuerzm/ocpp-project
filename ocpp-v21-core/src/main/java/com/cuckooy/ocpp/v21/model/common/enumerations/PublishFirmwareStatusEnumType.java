package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Publish firmware status enum type.
 */
public enum PublishFirmwareStatusEnumType {

    /**
     * Idle publish firmware status enum type.
     */
    Idle("Idle"),

    /**
     * Download scheduled publish firmware status enum type.
     */
    DownloadScheduled("DownloadScheduled"),

    /**
     * Downloading publish firmware status enum type.
     */
    Downloading("Downloading"),

    /**
     * Downloaded publish firmware status enum type.
     */
    Downloaded("Downloaded"),

    /**
     * Published publish firmware status enum type.
     */
    Published("Published"),

    /**
     * Download failed publish firmware status enum type.
     */
    DownloadFailed("DownloadFailed"),

    /**
     * Download paused publish firmware status enum type.
     */
    DownloadPaused("DownloadPaused"),

    /**
     * Invalid checksum publish firmware status enum type.
     */
    InvalidChecksum("InvalidChecksum"),

    /**
     * Checksum verified publish firmware status enum type.
     */
    ChecksumVerified("ChecksumVerified"),

    /**
     * Publish failed publish firmware status enum type.
     */
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
