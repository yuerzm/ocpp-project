package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class TaxRuleType {

    private Integer taxRuleId;
    private String taxRuleName;
    private Boolean taxIncludedInPrice;
    private Boolean appliesToEnergyFee;
    private Boolean appliesToParkingFee;
    private Boolean appliesToOverstayFee;
}

