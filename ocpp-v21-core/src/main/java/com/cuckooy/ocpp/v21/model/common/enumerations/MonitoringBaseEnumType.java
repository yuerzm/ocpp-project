package com.cuckooy.ocpp.v21.model.common.enumerations;

/**
 * The enum Monitoring base enum type.
 */
public enum MonitoringBaseEnumType {

    /**
     * All monitoring base enum type.
     */
    All("All"),
    /**
     * Factory default monitoring base enum type.
     */
    FactoryDefault("FactoryDefault"),
    /**
     * Hard wired only monitoring base enum type.
     */
    HardWiredOnly("HardWiredOnly");

    private final String value;

    MonitoringBaseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
