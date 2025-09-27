package com.tatadok.ocpp.v16.model.security.types;

public enum UploadLogStatusEnumType {

    BadMessage("BadMessage"),
    Idle("Idle"),
    NotSupportedOperation("NotSupportedOperation"),
    PermissionDenied("PermissionDenied"),
    Uploaded("Uploaded"),
    UploadFailure("UploadFailure"),
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
