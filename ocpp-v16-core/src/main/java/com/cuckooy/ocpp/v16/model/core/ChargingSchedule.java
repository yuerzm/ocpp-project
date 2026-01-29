package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.v16.model.smartcharging.ChargingRateUnitType;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
public class ChargingSchedule {

    private Integer duration;

    private Instant startSchedule;

    private ChargingRateUnitType chargingRateUnit;

    private List<ChargingSchedulePeriod> chargingSchedulePeriod;

    private Double minChargingRate;

}
