package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Overstay rule type.
 */
@Data
public class OverstayRuleType {

    private String overstayRuleDescription;
    private Integer startTime;
    private Integer overstayFeePeriod;
    private RationalNumberType overstayFee;

}
