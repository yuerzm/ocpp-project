package com.cuckooy.ocpp.v20.model.common.enumerations;

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
    Uploading("Uploading"),

    /**
     * Accepted canceled upload log status enum type.
     */
    AcceptedCanceled("AcceptedCanceled");

    private final String value;

    UploadLogStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
