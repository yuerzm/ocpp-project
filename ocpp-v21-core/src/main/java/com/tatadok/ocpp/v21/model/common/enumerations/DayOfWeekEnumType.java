package com.tatadok.ocpp.v21.model.common.enumerations;

public enum DayOfWeekEnumType {

    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday"),
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
