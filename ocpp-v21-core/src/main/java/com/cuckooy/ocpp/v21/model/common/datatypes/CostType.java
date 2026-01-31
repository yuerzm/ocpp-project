package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.CostKindEnumType;
import lombok.Data;

/**
 * The type Cost type.
 */
@Data
public class CostType {

    private CostKindEnumType costKind;
    private Integer amount;
    private Integer amountMultiplier;
}
