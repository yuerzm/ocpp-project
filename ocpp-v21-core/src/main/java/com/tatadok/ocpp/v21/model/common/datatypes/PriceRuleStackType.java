package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class PriceRuleStackType {

    private Integer duration;
    private List<PriceRuleType> priceRules;
}
