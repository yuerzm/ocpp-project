package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type V 2 x signal watt point type.
 */
@Data
public class V2XSignalWattPointType {

    private Integer signal;
    private BigDecimal power;
}
