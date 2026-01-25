package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum UploadLogStatusEnumType {

    BadMessage("BadMessage"),

    Idle("Idle"),

    NotSupportedOperation("NotSupportedOperation"),

    PermissionDenied("PermissionDenied"),

    Uploaded("Uploaded"),

    UploadFailure("UploadFailure"),

    Uploading("Uploading"),

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
