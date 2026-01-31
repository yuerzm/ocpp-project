package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;

/**
 * The type Ev power schedule entry type.
 */
@Data
public class EVPowerScheduleEntryType {

    private Integer duration;
    private BigDecimal power;
}
