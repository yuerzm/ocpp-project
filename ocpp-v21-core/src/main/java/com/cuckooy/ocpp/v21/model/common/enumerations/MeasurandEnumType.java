package com.cuckooy.ocpp.v21.model.common.enumerations;

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
    SoC("SoC"),

    /**
     * Current import offered measurand enum type.
     */
    CurrentImportOffered("Current.Import.Offered"),
    /**
     * Current import minimum measurand enum type.
     */
    CurrentImportMinimum("Current.Import.Minimum"),
    /**
     * Current export offered measurand enum type.
     */
    CurrentExportOffered("Current.Export.Offered"),
    /**
     * Current export minimum measurand enum type.
     */
    CurrentExportMinimum("Current.Export.Minimum"),
    /**
     * Display present soc measurand enum type.
     */
    DisplayPresentSOC("Display.PresentSOC"),
    /**
     * Display minimum soc measurand enum type.
     */
    DisplayMinimumSOC("Display.MinimumSOC"),
    /**
     * Display target soc measurand enum type.
     */
    DisplayTargetSOC("Display.TargetSOC"),
    /**
     * Display maximum soc measurand enum type.
     */
    DisplayMaximumSOC("Display.MaximumSOC"),
    /**
     * Display remaining time to minimum soc measurand enum type.
     */
    DisplayRemainingTimeToMinimumSOC("Display.RemainingTimeToMinimumSOC"),
    /**
     * Display remaining time to target soc measurand enum type.
     */
    DisplayRemainingTimeToTargetSOC("Display.RemainingTimeToTargetSOC"),
    /**
     * Display remaining time to maximum soc measurand enum type.
     */
    DisplayRemainingTimeToMaximumSOC("Display.RemainingTimeToMaximumSOC"),
    /**
     * Display charging complete measurand enum type.
     */
    DisplayChargingComplete("Display.ChargingComplete"),
    /**
     * Display battery energy capacity measurand enum type.
     */
    DisplayBatteryEnergyCapacity("Display.BatteryEnergyCapacity"),
    /**
     * Display inlet hot measurand enum type.
     */
    DisplayInletHot("Display.InletHot"),
    /**
     * Energy active import cable loss measurand enum type.
     */
    EnergyActiveImportCableLoss("Energy.Active.Import.CableLoss"),
    /**
     * Energy active import local generation register measurand enum type.
     */
    EnergyActiveImportLocalGenerationRegister("Energy.Active.Import.LocalGeneration.Register"),
    /**
     * Energy active setpoint interval measurand enum type.
     */
    EnergyActiveSetpointInterval("Energy.Active.Setpoint.Interval"),
    /**
     * Energy request target measurand enum type.
     */
    EnergyRequestTarget("EnergyRequest.Target"),
    /**
     * Energy request minimum measurand enum type.
     */
    EnergyRequestMinimum("EnergyRequest.Minimum"),
    /**
     * Energy request maximum measurand enum type.
     */
    EnergyRequestMaximum("EnergyRequest.Maximum"),
    /**
     * Energy request minimum v 2 x measurand enum type.
     */
    EnergyRequestMinimumV2X("EnergyRequest.Minimum.V2X"),
    /**
     * Energy request maximum v 2 x measurand enum type.
     */
    EnergyRequestMaximumV2X("EnergyRequest.Maximum.V2X"),
    /**
     * Energy request bulk measurand enum type.
     */
    EnergyRequestBulk("EnergyRequest.Bulk"),
    /**
     * Power active setpoint measurand enum type.
     */
    PowerActiveSetpoint("Power.Active.Setpoint"),
    /**
     * Power active residual measurand enum type.
     */
    PowerActiveResidual("Power.Active.Residual"),
    /**
     * Power export minimum measurand enum type.
     */
    PowerExportMinimum("Power.Export.Minimum"),
    /**
     * Power export offered measurand enum type.
     */
    PowerExportOffered("Power.Export.Offered"),
    /**
     * Power import minimum measurand enum type.
     */
    PowerImportMinimum("Power.Import.Minimum"),
    /**
     * Power import offered measurand enum type.
     */
    PowerImportOffered("Power.Import.Offered"),
    /**
     * Voltage minimum measurand enum type.
     */
    VoltageMinimum("Voltage.Minimum"),
    /**
     * Voltage maximum measurand enum type.
     */
    VoltageMaximum("Voltage.Maximum"),
    ;

    private final String value;

    MeasurandEnumType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
