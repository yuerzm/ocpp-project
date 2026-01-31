package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

/**
 * The type Charging schedule period type.
 */
@Data
public class ChargingSchedulePeriodType {

    private Integer startPeriod;
    private Double limit;
    private Integer numberPhases;
    private Integer phaseToUse;
}
