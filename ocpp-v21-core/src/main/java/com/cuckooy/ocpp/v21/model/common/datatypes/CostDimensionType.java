package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.CostDimensionEnumType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Cost dimension type.
 */
@Data
public class CostDimensionType {

    private CostDimensionEnumType type;
    private BigDecimal volume;
}
