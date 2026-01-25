package com.cuckooy.ocpp.v16.model.core;

public enum Measurand {

    CurrentExport("Current.Export"),
    CurrentImport("Current.Import"),
    CurrentOffered("Current.Offered"),
    EnergyActiveExportRegister("Energy.Active.Export.Register"),
    EnergyActiveImportRegister("Energy.Active.Import.Register"),
    EnergyReactiveExportRegister("Energy.Reactive.Export.Register"),
    EnergyReactiveImportRegister("Energy.Reactive.Import.Register"),
    EnergyActiveExportInterval("Energy.Active.Export.Interval"),
    EnergyActiveImportInterval("Energy.Active.Import.Interval"),
    EnergyReactiveExportInterval("Energy.Reactive.Export.Interval"),
    EnergyReactiveImportInterval("Energy.Reactive.Import.Interval"),
    Frequency("Frequency"),
    PowerActiveExport("Power.Active.Export"),
    PowerActiveImport("Power.Active.Import"),
    PowerFactor("Power.Factor"),
    PowerOffered("Power.Offered"),
    PowerReactiveExport("Power.Reactive.Export"),
    PowerReactiveImport("Power.Reactive.Import"),
    RPM("RPM"),
    SoC("SoC"),
    Temperature("Temperature"),
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