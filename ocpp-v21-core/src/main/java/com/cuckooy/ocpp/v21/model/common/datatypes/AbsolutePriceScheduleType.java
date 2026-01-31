package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Absolute price schedule type.
 */
@Data
public class AbsolutePriceScheduleType {

    private Instant timeAnchor;
    private Integer priceScheduleID;
    private String priceScheduleDescription;
    private String currency;
    private String language;
    private String priceAlgorithm;
    private List<PriceRuleStackType> priceRuleStacks;
    private List<TaxRuleType> taxRules;
    private List<AdditionalSelectedServicesType> additionalSelectedServices;
    private OverstayRuleListType overstayRuleList;
    private RationalNumberType minimumCost;
    private RationalNumberType maximumCost;
}
