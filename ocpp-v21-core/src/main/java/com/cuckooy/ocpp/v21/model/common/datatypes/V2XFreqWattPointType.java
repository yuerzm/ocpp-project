package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type V 2 x freq watt point type.
 */
@Data
public class V2XFreqWattPointType {

    private BigDecimal frequency;
    private BigDecimal power;
}
