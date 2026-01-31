package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Day of week enum type.
 */
public enum DayOfWeekEnumType {

    /**
     * Monday day of week enum type.
     */
    Monday("Monday"),
    /**
     * Tuesday day of week enum type.
     */
    Tuesday("Tuesday"),
    /**
     * Wednesday day of week enum type.
     */
    Wednesday("Wednesday"),
    /**
     * Thursday day of week enum type.
     */
    Thursday("Thursday"),
    /**
     * Friday day of week enum type.
     */
    Friday("Friday"),
    /**
     * Saturday day of week enum type.
     */
    Saturday("Saturday"),
    /**
     * Sunday day of week enum type.
     */
    Sunday("Sunday"),
    ;

    private final String value;

    DayOfWeekEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
