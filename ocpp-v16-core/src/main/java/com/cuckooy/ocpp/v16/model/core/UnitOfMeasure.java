package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Unit of measure.
 */
public enum UnitOfMeasure {

    /**
     * Wh unit of measure.
     */
    Wh("Wh"),

    /**
     * K wh unit of measure.
     */
    kWh("kWh"),

    /**
     * Varh unit of measure.
     */
    varh("varh"),

    /**
     * Kvarh unit of measure.
     */
    kvarh("kvarh"),

    /**
     * W unit of measure.
     */
    W("W"),

    /**
     * K w unit of measure.
     */
    kW("kW"),

    /**
     * Va unit of measure.
     */
    VA("VA"),

    /**
     * K va unit of measure.
     */
    kVA("kVA"),

    /**
     * Var unit of measure.
     */
    var("var"),

    /**
     * Kvar unit of measure.
     */
    kvar("kvar"),

    /**
     * A unit of measure.
     */
    A("A"),

    /**
     * V unit of measure.
     */
    V("V"),

    /**
     * Celsius unit of measure.
     */
    Celsius("Celsius"),

    /**
     * Fahrenheit unit of measure.
     */
    Fahrenheit("Fahrenheit"),

    /**
     * K unit of measure.
     */
    K("K"),

    /**
     * Percent unit of measure.
     */
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
