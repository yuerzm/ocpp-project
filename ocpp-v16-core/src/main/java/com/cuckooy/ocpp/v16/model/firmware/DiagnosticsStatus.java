package com.cuckooy.ocpp.v16.model.firmware;

/**
 * The enum Diagnostics status.
 */
public enum DiagnosticsStatus {

    /**
     * Idle diagnostics status.
     */
    Idle("Idle"),

    /**
     * Uploaded diagnostics status.
     */
    Uploaded("Uploaded"),

    /**
     * Upload failed diagnostics status.
     */
    UploadFailed("UploadFailed"),

    /**
     * Uploading diagnostics status.
     */
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
