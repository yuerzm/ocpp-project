package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class V2XChargingParametersType {

    private BigDecimal minChargePower;
    private BigDecimal minChargePower_L2;
    private BigDecimal minChargePower_L3;
    private BigDecimal maxChargePower;
    private BigDecimal maxChargePower_L2;
    private BigDecimal maxChargePower_L3;
    private BigDecimal minDischargePower;
    private BigDecimal minDischargePower_L2;
    private BigDecimal minDischargePower_L3;
    private BigDecimal maxDischargePower;
    private BigDecimal maxDischargePower_L2;
    private BigDecimal maxDischargePower_L3;
}
