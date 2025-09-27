package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.CostDimensionEnumType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CostDimensionType {

    private CostDimensionEnumType type;
    private BigDecimal volume;
}
