package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Data enum type.
 */
public enum DataEnumType {

    /**
     * String data enum type.
     */
    STRING("string"),

    /**
     * Decimal data enum type.
     */
    DECIMAL("decimal"),

    /**
     * Integer data enum type.
     */
    INTEGER("integer"),

    /**
     * Date time data enum type.
     */
    DateTime("dateTime"),

    /**
     * Boolean data enum type.
     */
    BOOLEAN("boolean"),

    /**
     * Option list data enum type.
     */
    OptionList("OptionList"),

    /**
     * Sequence list data enum type.
     */
    SequenceList("SequenceList"),

    /**
     * Member list data enum type.
     */
    MemberList("MemberList");

    private final String value;

    DataEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
