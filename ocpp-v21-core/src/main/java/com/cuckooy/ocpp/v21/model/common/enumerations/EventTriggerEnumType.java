package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Event trigger enum type.
 */
public enum EventTriggerEnumType {

    /**
     * Alerting event trigger enum type.
     */
    Alerting("Alerting"),

    /**
     * Delta event trigger enum type.
     */
    Delta("Delta"),

    /**
     * Periodic event trigger enum type.
     */
    Periodic("Periodic");

    private final String value;

    EventTriggerEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
