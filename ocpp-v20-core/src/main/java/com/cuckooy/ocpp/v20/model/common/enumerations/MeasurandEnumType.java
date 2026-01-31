package com.cuckooy.ocpp.v20.model.common.enumerations;

/**
 * The enum Measurand enum type.
 */
public enum MeasurandEnumType {

    /**
     * Energy active export register measurand enum type.
     */
    EnergyActiveExportRegister("Energy.Active.Export.Register"),

    /**
     * Energy active import register measurand enum type.
     */
    EnergyActiveImportRegister("Energy.Active.Import.Register"),

    /**
     * Energy reactive export register measurand enum type.
     */
    EnergyReactiveExportRegister("Energy.Reactive.Export.Register"),

    /**
     * Energy reactive import register measurand enum type.
     */
    EnergyReactiveImportRegister("Energy.Reactive.Import.Register"),

    /**
     * Energy active export interval measurand enum type.
     */
    EnergyActiveExportInterval("Energy.Active.Export.Interval"),

    /**
     * Energy active import interval measurand enum type.
     */
    EnergyActiveImportInterval("Energy.Active.Import.Interval"),

    /**
     * Energy active net measurand enum type.
     */
    EnergyActiveNet("Energy.Active.Net"),

    /**
     * Energy reactive export interval measurand enum type.
     */
    EnergyReactiveExportInterval("Energy.Reactive.Export.Interval"),

    /**
     * Energy reactive import interval measurand enum type.
     */
    EnergyReactiveImportInterval("Energy.Reactive.Import.Interval"),

    /**
     * Energy reactive net measurand enum type.
     */
    EnergyReactiveNet("Energy.Reactive.Net"),

    /**
     * Energy apparent net measurand enum type.
     */
    EnergyApparentNet("Energy.Apparent.Net"),

    /**
     * Energy apparent import measurand enum type.
     */
    EnergyApparentImport("Energy.Apparent.Import"),

    /**
     * Energy apparent export measurand enum type.
     */
    EnergyApparentExport("Energy.Apparent.Export"),

    /**
     * Power active export measurand enum type.
     */
    PowerActiveExport("Power.Active.Export"),

    /**
     * Power active import measurand enum type.
     */
    PowerActiveImport("Power.Active.Import"),

    /**
     * Power offered measurand enum type.
     */
    PowerOffered("Power.Offered"),

    /**
     * Power reactive export measurand enum type.
     */
    PowerReactiveExport("Power.Reactive.Export"),

    /**
     * Power reactive import measurand enum type.
     */
    PowerReactiveImport("Power.Reactive.Import"),

    /**
     * Power factor measurand enum type.
     */
    PowerFactor("Power.Factor"),

    /**
     * Current import measurand enum type.
     */
    CurrentImport("Current.Import"),

    /**
     * Current export measurand enum type.
     */
    CurrentExport("Current.Export"),

    /**
     * Current offered measurand enum type.
     */
    CurrentOffered("Current.Offered"),

    /**
     * Voltage measurand enum type.
     */
    Voltage("Voltage"),

    /**
     * Frequency measurand enum type.
     */
    Frequency("Frequency"),

    /**
     * So c measurand enum type.
     */
    SoC("SoC");

    private final String value;

    MeasurandEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
