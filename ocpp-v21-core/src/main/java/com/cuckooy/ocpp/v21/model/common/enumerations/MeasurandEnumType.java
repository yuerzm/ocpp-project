package com.cuckooy.ocpp.v21.model.common.enumerations;

public enum MeasurandEnumType {

    EnergyActiveExportRegister("Energy.Active.Export.Register"),

    EnergyActiveImportRegister("Energy.Active.Import.Register"),

    EnergyReactiveExportRegister("Energy.Reactive.Export.Register"),

    EnergyReactiveImportRegister("Energy.Reactive.Import.Register"),

    EnergyActiveExportInterval("Energy.Active.Export.Interval"),

    EnergyActiveImportInterval("Energy.Active.Import.Interval"),

    EnergyActiveNet("Energy.Active.Net"),

    EnergyReactiveExportInterval("Energy.Reactive.Export.Interval"),

    EnergyReactiveImportInterval("Energy.Reactive.Import.Interval"),

    EnergyReactiveNet("Energy.Reactive.Net"),

    EnergyApparentNet("Energy.Apparent.Net"),

    EnergyApparentImport("Energy.Apparent.Import"),

    EnergyApparentExport("Energy.Apparent.Export"),

    PowerActiveExport("Power.Active.Export"),

    PowerActiveImport("Power.Active.Import"),

    PowerOffered("Power.Offered"),

    PowerReactiveExport("Power.Reactive.Export"),

    PowerReactiveImport("Power.Reactive.Import"),

    PowerFactor("Power.Factor"),

    CurrentImport("Current.Import"),

    CurrentExport("Current.Export"),

    CurrentOffered("Current.Offered"),

    Voltage("Voltage"),

    Frequency("Frequency"),

    SoC("SoC"),

    CurrentImportOffered("Current.Import.Offered"),
    CurrentImportMinimum("Current.Import.Minimum"),
    CurrentExportOffered("Current.Export.Offered"),
    CurrentExportMinimum("Current.Export.Minimum"),
    DisplayPresentSOC("Display.PresentSOC"),
    DisplayMinimumSOC("Display.MinimumSOC"),
    DisplayTargetSOC("Display.TargetSOC"),
    DisplayMaximumSOC("Display.MaximumSOC"),
    DisplayRemainingTimeToMinimumSOC("Display.RemainingTimeToMinimumSOC"),
    DisplayRemainingTimeToTargetSOC("Display.RemainingTimeToTargetSOC"),
    DisplayRemainingTimeToMaximumSOC("Display.RemainingTimeToMaximumSOC"),
    DisplayChargingComplete("Display.ChargingComplete"),
    DisplayBatteryEnergyCapacity("Display.BatteryEnergyCapacity"),
    DisplayInletHot("Display.InletHot"),
    EnergyActiveImportCableLoss("Energy.Active.Import.CableLoss"),
    EnergyActiveImportLocalGenerationRegister("Energy.Active.Import.LocalGeneration.Register"),
    EnergyActiveSetpointInterval("Energy.Active.Setpoint.Interval"),
    EnergyRequestTarget("EnergyRequest.Target"),
    EnergyRequestMinimum("EnergyRequest.Minimum"),
    EnergyRequestMaximum("EnergyRequest.Maximum"),
    EnergyRequestMinimumV2X("EnergyRequest.Minimum.V2X"),
    EnergyRequestMaximumV2X("EnergyRequest.Maximum.V2X"),
    EnergyRequestBulk("EnergyRequest.Bulk"),
    PowerActiveSetpoint("Power.Active.Setpoint"),
    PowerActiveResidual("Power.Active.Residual"),
    PowerExportMinimum("Power.Export.Minimum"),
    PowerExportOffered("Power.Export.Offered"),
    PowerImportMinimum("Power.Import.Minimum"),
    PowerImportOffered("Power.Import.Offered"),
    VoltageMinimum("Voltage.Minimum"),
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
