package com.cuckooy.ocpp.v16.model.core;

/**
 * The enum Measurand.
 */
public enum Measurand {

    /**
     * Current export measurand.
     */
    CurrentExport("Current.Export"),
    /**
     * Current import measurand.
     */
    CurrentImport("Current.Import"),
    /**
     * Current offered measurand.
     */
    CurrentOffered("Current.Offered"),
    /**
     * Energy active export register measurand.
     */
    EnergyActiveExportRegister("Energy.Active.Export.Register"),
    /**
     * Energy active import register measurand.
     */
    EnergyActiveImportRegister("Energy.Active.Import.Register"),
    /**
     * Energy reactive export register measurand.
     */
    EnergyReactiveExportRegister("Energy.Reactive.Export.Register"),
    /**
     * Energy reactive import register measurand.
     */
    EnergyReactiveImportRegister("Energy.Reactive.Import.Register"),
    /**
     * Energy active export interval measurand.
     */
    EnergyActiveExportInterval("Energy.Active.Export.Interval"),
    /**
     * Energy active import interval measurand.
     */
    EnergyActiveImportInterval("Energy.Active.Import.Interval"),
    /**
     * Energy reactive export interval measurand.
     */
    EnergyReactiveExportInterval("Energy.Reactive.Export.Interval"),
    /**
     * Energy reactive import interval measurand.
     */
    EnergyReactiveImportInterval("Energy.Reactive.Import.Interval"),
    /**
     * Frequency measurand.
     */
    Frequency("Frequency"),
    /**
     * Power active export measurand.
     */
    PowerActiveExport("Power.Active.Export"),
    /**
     * Power active import measurand.
     */
    PowerActiveImport("Power.Active.Import"),
    /**
     * Power factor measurand.
     */
    PowerFactor("Power.Factor"),
    /**
     * Power offered measurand.
     */
    PowerOffered("Power.Offered"),
    /**
     * Power reactive export measurand.
     */
    PowerReactiveExport("Power.Reactive.Export"),
    /**
     * Power reactive import measurand.
     */
    PowerReactiveImport("Power.Reactive.Import"),
    /**
     * Rpm measurand.
     */
    RPM("RPM"),
    /**
     * So c measurand.
     */
    SoC("SoC"),
    /**
     * Temperature measurand.
     */
    Temperature("Temperature"),
    /**
     * Voltage measurand.
     */
    Voltage("Voltage");

    private final String value;

    Measurand(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}