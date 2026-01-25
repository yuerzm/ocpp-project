package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum EventNotificationEnumType {

    HardWiredNotification("HardWiredNotification"),

    HardWiredMonitor("HardWiredMonitor"),

    PreconfiguredMonitor("PreconfiguredMonitor"),

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
