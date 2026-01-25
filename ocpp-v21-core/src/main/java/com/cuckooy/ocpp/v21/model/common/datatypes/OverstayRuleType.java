package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class OverstayRuleType {

    private String overstayRuleDescription;
    private Integer startTime;
    private Integer overstayFeePeriod;
    private RationalNumberType overstayFee;

}
