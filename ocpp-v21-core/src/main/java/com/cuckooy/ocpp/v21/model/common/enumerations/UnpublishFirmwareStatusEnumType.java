package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Unpublish firmware status enum type.
 */
public enum UnpublishFirmwareStatusEnumType {

    /**
     * Download ongoing unpublish firmware status enum type.
     */
    DownloadOngoing("DownloadOngoing"),
    /**
     * No firmware unpublish firmware status enum type.
     */
    NoFirmware("NoFirmware"),
    /**
     * Unpublished unpublish firmware status enum type.
     */
    Unpublished("Unpublished");

    private final String value;

    UnpublishFirmwareStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
