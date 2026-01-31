package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.EnergyTransferModeEnumType;
import lombok.Data;

import java.time.Instant;

/**
 * The type Charging needs type.
 */
@Data
public class ChargingNeedsType {

    private EnergyTransferModeEnumType requestedEnergyTransfer;
    private Instant departureTime;
    private ACChargingParametersType acChargingParameters;
    private DCChargingParametersType dcChargingParameters;
}
