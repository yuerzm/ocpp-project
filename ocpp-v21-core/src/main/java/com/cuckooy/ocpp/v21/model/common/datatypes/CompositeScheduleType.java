package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Composite schedule type.
 */
@Data
public class CompositeScheduleType {

    private Integer evseId;
    private Integer duration;
    private Instant scheduleStart;
    private ChargingRateUnitEnumType chargingRateUnit;
    private List<ChargingSchedulePeriodType> chargingSchedulePeriod;
}
