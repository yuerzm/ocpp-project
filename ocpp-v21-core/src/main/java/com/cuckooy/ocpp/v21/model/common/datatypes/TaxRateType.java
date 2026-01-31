package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Tax rate type.
 */
@Data
public class TaxRateType {

    private String type;
    private BigDecimal tax;
    private Integer stack;
}
