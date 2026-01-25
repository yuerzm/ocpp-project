package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.CostKindEnumType;
import lombok.Data;

@Data
public class CostType {

    private CostKindEnumType costKind;
    private Integer amount;
    private Integer amountMultiplier;
}
