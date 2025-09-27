package com.tatadok.ocpp.v16.model.core;

public enum UnlockStatus {

    Unlocked("Unlocked"),

    UnlockFailed("UnlockFailed"),

    NotSupported("NotSupported");

    private final String value;

    UnlockStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
