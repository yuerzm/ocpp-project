package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class V2XSignalWattPointType {

    private Integer signal;
    private BigDecimal power;
}
