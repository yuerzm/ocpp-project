package com.cuckooy.ocpp.v16.model.security.types;

/**
 * The enum Upload log status enum type.
 */
public enum UploadLogStatusEnumType {

    /**
     * Bad message upload log status enum type.
     */
    BadMessage("BadMessage"),
    /**
     * Idle upload log status enum type.
     */
    Idle("Idle"),
    /**
     * Not supported operation upload log status enum type.
     */
    NotSupportedOperation("NotSupportedOperation"),
    /**
     * Permission denied upload log status enum type.
     */
    PermissionDenied("PermissionDenied"),
    /**
     * Uploaded upload log status enum type.
     */
    Uploaded("Uploaded"),
    /**
     * Upload failure upload log status enum type.
     */
    UploadFailure("UploadFailure"),
    /**
     * Uploading upload log status enum type.
     */
    Uploading("Uploading");

    private final String value;

    UploadLogStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
