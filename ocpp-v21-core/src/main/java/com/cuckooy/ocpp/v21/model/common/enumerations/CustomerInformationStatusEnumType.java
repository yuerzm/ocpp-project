package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Customer information status enum type.
 */
public enum CustomerInformationStatusEnumType {

    /**
     * Accepted customer information status enum type.
     */
    Accepted("Accepted"),
    /**
     * Rejected customer information status enum type.
     */
    Rejected("Rejected"),
    /**
     * Invalid customer information status enum type.
     */
    Invalid("Invalid");

    private final String value;

    CustomerInformationStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
