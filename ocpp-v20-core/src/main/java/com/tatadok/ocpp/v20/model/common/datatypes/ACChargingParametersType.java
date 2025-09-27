package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class ACChargingParametersType {

    private Integer energyAmount;
    private Integer evMinCurrent;
    private Integer evMaxCurrent;
    private Integer evMaxVoltage;
}
