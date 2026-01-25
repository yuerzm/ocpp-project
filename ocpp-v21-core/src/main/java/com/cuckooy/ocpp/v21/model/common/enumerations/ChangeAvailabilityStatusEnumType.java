package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum ChangeAvailabilityStatusEnumType {

    Accepted("Accepted"),

    Rejected("Rejected"),

    Scheduled("Scheduled");

    private final String value;

    ChangeAvailabilityStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
