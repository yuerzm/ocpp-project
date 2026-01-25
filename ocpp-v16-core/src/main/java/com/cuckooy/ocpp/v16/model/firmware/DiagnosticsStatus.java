package com.cuckooy.ocpp.v16.model.firmware;

public enum DiagnosticsStatus {

    Idle("Idle"),

    Uploaded("Uploaded"),

    UploadFailed("UploadFailed"),

    Uploading("Uploading");

    private final String value;

    DiagnosticsStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
