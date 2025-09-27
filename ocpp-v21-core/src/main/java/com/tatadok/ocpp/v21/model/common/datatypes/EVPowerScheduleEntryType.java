package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EVPowerScheduleEntryType {

    private Integer duration;
    private BigDecimal power;
}
