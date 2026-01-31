package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Event notification enum type.
 */
public enum EventNotificationEnumType {

    /**
     * Hard wired notification event notification enum type.
     */
    HardWiredNotification("HardWiredNotification"),

    /**
     * Hard wired monitor event notification enum type.
     */
    HardWiredMonitor("HardWiredMonitor"),

    /**
     * Preconfigured monitor event notification enum type.
     */
    PreconfiguredMonitor("PreconfiguredMonitor"),

    /**
     * Custom monitor event notification enum type.
     */
    CustomMonitor("CustomMonitor");

    private final String value;

    EventNotificationEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
