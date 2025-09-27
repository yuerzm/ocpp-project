package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class V2XFreqWattPointType {

    private BigDecimal frequency;
    private BigDecimal power;
}
