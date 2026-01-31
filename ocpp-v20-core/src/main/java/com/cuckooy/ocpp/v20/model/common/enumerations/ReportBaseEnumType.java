package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Report base enum type.
 */
public enum ReportBaseEnumType {

    /**
     * Configuration inventory report base enum type.
     */
    ConfigurationInventory("ConfigurationInventory"),

    /**
     * Full inventory report base enum type.
     */
    FullInventory("FullInventory"),

    /**
     * Summary inventory report base enum type.
     */
    SummaryInventory("SummaryInventory");

    private final String value;

    ReportBaseEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
