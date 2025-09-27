package com.tatadok.ocpp.v21.model.common.enumerations;

public enum ReportBaseEnumType {

    ConfigurationInventory("ConfigurationInventory"),

    FullInventory("FullInventory"),

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
