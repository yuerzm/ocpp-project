package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class ChargingSchedulePeriodType {

    private Integer startPeriod;
    private Double limit;
    private Integer numberPhases;
    private Integer phaseToUse;
}
