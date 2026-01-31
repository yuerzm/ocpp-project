package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * The type Price type.
 */
@Data
public class PriceType {

    private BigDecimal exclTax;
    private BigDecimal inclTax;
    private List<TaxRateType> taxRates;
}
