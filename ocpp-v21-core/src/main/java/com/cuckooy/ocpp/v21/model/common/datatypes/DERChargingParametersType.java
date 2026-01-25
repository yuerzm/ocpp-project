package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.DERControlEnumType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DERChargingParametersType {

    private DERControlEnumType evSupportedDERControl;
    private BigDecimal evOverExcitedMaxDischargePower;
    private BigDecimal evOverExcitedPowerFactor;
    private BigDecimal evUnderExcitedMaxDischargePower;
    private BigDecimal evUnderExcitedPowerFactor;
    private BigDecimal maxApparentPower;
    private BigDecimal maxChargeApparentPower;

}
