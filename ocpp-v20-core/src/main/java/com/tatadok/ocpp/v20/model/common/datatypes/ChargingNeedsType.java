package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.EnergyTransferModeEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ChargingNeedsType {

    private EnergyTransferModeEnumType requestedEnergyTransfer;
    private ZonedDateTime departureTime;
    private ACChargingParametersType acChargingParameters;
    private DCChargingParametersType dcChargingParameters;
}
