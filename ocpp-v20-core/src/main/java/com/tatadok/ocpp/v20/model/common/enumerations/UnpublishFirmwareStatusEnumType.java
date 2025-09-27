package com.tatadok.ocpp.v20.model.common.enumerations;

public enum UnpublishFirmwareStatusEnumType {

    DownloadOngoing("DownloadOngoing"),
    NoFirmware("NoFirmware"),
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
