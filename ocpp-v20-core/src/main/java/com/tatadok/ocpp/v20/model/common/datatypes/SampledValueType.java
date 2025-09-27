package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.LocationEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.MeasurandEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.PhaseEnumType;
import com.tatadok.ocpp.v20.model.common.enumerations.ReadingContextEnumType;
import lombok.Data;

@Data
public class SampledValueType {

    private Double value;
    private ReadingContextEnumType context = ReadingContextEnumType.InterruptionBegin;
    private MeasurandEnumType measurand = MeasurandEnumType.EnergyActiveImportRegister;
    private PhaseEnumType phase;
    private LocationEnumType location = LocationEnumType.Outlet;
    private SignedMeterValueType signedMeterValue;
    private UnitOfMeasure unitOfMeasure;
}
