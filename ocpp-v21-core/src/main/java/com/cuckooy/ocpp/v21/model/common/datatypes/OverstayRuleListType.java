package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Overstay rule list type.
 */
@Data
public class OverstayRuleListType {

    private Integer overstayTimeThreshold;
    private RationalNumberType overstayPowerThreshold;
    private OverstayRuleType overstayRule;
}
