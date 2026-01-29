package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class CompositeScheduleType {

    private Integer evseId;
    private Integer duration;
    private Instant scheduleStart;
    private ChargingRateUnitEnumType chargingRateUnit;
    private List<ChargingSchedulePeriodType> chargingSchedulePeriod;
}
