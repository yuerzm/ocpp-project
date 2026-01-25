package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class DCChargingParametersType {

    private Integer evMaxCurrent;
    private Integer evMaxVoltage;
    private Integer energyAmount;
    private Integer evMaxPower;
    private Integer stateOfCharge;
    private Integer evEnergyCapacity;
    private Integer fullSoC;
    private Integer bulkSoC;
}
