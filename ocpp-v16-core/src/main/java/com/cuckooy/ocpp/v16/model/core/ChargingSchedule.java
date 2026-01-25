package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.v16.model.smartcharging.ChargingRateUnitType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class ChargingSchedule {

    private Integer duration;

    private ZonedDateTime startSchedule;

    private ChargingRateUnitType chargingRateUnit;

    private List<ChargingSchedulePeriod> chargingSchedulePeriod;

    private Double minChargingRate;

}
