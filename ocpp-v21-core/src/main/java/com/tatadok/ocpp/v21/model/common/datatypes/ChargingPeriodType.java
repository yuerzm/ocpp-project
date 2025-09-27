package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class ChargingPeriodType {

    private String tariffId;
    private ZonedDateTime startPeriod;
    private List<CostDimensionType> dimensions;
}
