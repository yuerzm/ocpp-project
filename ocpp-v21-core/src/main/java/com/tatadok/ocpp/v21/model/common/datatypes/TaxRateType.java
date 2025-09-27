package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxRateType {

    private String type;
    private BigDecimal tax;
    private Integer stack;
}
