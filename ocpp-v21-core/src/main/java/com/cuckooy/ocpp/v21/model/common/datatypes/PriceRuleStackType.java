package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Price rule stack type.
 */
@Data
public class PriceRuleStackType {

    private Integer duration;
    private List<PriceRuleType> priceRules;
}
