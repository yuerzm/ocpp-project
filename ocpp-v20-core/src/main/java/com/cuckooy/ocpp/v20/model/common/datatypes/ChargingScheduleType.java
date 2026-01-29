package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class ChargingScheduleType {

    private Integer id;
    private ChargingRateUnitEnumType chargingRateUnit;
    private List<ChargingSchedulePeriodType> chargingSchedulePeriod;
    private Instant startSchedule;
    private Integer duration;
    private Double minChargingRate;
    private SalesTariffType salesTariff;
}
