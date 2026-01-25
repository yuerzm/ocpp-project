package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SampledValue {

    private String value;

    private ReadingContext context = ReadingContext.SamplePeriodic;

    private ValueFormat format = ValueFormat.Raw;

    private Measurand measurand = Measurand.EnergyActiveImportRegister;

    private Phase phase;

    private Location location = Location.Outlet;

    private UnitOfMeasure unit = UnitOfMeasure.Wh;

}
