package com.tatadok.ocpp.v16.model.core;

public enum UnitOfMeasure {

    Wh("Wh"),

    kWh("kWh"),

    varh("varh"),

    kvarh("kvarh"),

    W("W"),

    kW("kW"),

    VA("VA"),

    kVA("kVA"),

    var("var"),

    kvar("kvar"),

    A("A"),

    V("V"),

    Celsius("Celsius"),

    Fahrenheit("Fahrenheit"),

    K("K"),

    Percent("Percent");

    private final String value;

    UnitOfMeasure(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
