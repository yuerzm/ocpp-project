package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class PriceRuleType {

    private Integer parkingFeePeriod;
    private Integer carbonDioxideEmission;
    private Integer renewableGenerationPercentage;
    private RationalNumberType energyFee;
    private RationalNumberType parkingFee;
    private RationalNumberType powerRangeStart;
}
