package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Ac charging parameters type.
 */
@Data
public class ACChargingParametersType {

    private BigDecimal energyAmount;
    private BigDecimal evMinCurrent;
    private BigDecimal evMaxCurrent;
    private BigDecimal evMaxVoltage;
}
