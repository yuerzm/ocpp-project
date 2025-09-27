package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.PhaseEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.LocationEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.MeasurandEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.ReadingContextEnumType;
import lombok.Data;

@Data
public class SampledValueType {

    private Double value;
    private com.tatadok.ocpp.v21.model.common.enumerations.ReadingContextEnumType context = ReadingContextEnumType.InterruptionBegin;
    private com.tatadok.ocpp.v21.model.common.enumerations.MeasurandEnumType measurand = MeasurandEnumType.EnergyActiveImportRegister;
    private PhaseEnumType phase;
    private com.tatadok.ocpp.v21.model.common.enumerations.LocationEnumType location = LocationEnumType.Outlet;
    private SignedMeterValueType signedMeterValue;
    private UnitOfMeasure unitOfMeasure;
}
