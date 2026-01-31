package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Notify allowed energy transfer status enum type.
 */
public enum NotifyAllowedEnergyTransferStatusEnumType {

    /**
     * Accepted notify allowed energy transfer status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected notify allowed energy transfer status enum type.
     */
    Rejected("Rejected"),
    ;

    private final String value;

    NotifyAllowedEnergyTransferStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
