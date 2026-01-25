package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ACChargingParametersType {

    private BigDecimal energyAmount;
    private BigDecimal evMinCurrent;
    private BigDecimal evMaxCurrent;
    private BigDecimal evMaxVoltage;
}
