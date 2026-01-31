package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

/**
 * The type Ac charging parameters type.
 */
@Data
public class ACChargingParametersType {

    private Integer energyAmount;
    private Integer evMinCurrent;
    private Integer evMaxCurrent;
    private Integer evMaxVoltage;
}
