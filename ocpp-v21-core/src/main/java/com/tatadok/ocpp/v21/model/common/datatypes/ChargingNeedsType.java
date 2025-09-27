package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.ControlModeEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.EnergyTransferModeEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.MobilityNeedsModeEnumType;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ChargingNeedsType {

    private EnergyTransferModeEnumType requestedEnergyTransfer;
    private EnergyTransferModeEnumType availableEnergyTransfer;
    private ControlModeEnumType controlMode;
    private MobilityNeedsModeEnumType mobilityNeedsMode;
    private ZonedDateTime departureTime;
    private V2XChargingParametersType v2xChargingParameters;
    private DCChargingParametersType dcChargingParameters;
    private ACChargingParametersType acChargingParameters;
    private EVEnergyOfferType evEnergyOffer;
    private DERChargingParametersType derChargingParameters;
}
