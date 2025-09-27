package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.CostKindEnumType;
import lombok.Data;

@Data
public class CostType {

    private CostKindEnumType costKind;
    private Integer amount;
    private Integer amountMultiplier;
}
