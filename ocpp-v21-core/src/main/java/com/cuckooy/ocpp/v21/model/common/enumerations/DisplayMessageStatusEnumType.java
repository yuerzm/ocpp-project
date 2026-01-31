package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Display message status enum type.
 */
public enum DisplayMessageStatusEnumType {

    /**
     * Accepted display message status enum type.
     */
    Accepted("Accepted"),
    /**
     * Not supported message format display message status enum type.
     */
    NotSupportedMessageFormat("NotSupportedMessageFormat"),
    /**
     * Rejected display message status enum type.
     */
    Rejected("Rejected"),
    /**
     * Not supported priority display message status enum type.
     */
    NotSupportedPriority("NotSupportedPriority"),
    /**
     * Not supported state display message status enum type.
     */
    NotSupportedState("NotSupportedState"),
    /**
     * Unknown transaction display message status enum type.
     */
    UnknownTransaction("UnknownTransaction"),
    /**
     * Language not supported display message status enum type.
     */
    LanguageNotSupported("LanguageNotSupported"),
    ;

    private final String value;

    DisplayMessageStatusEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
