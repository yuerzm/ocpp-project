package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class ChargingScheduleType {

    private Integer id;
    private ChargingRateUnitEnumType chargingRateUnit;
    private List<ChargingSchedulePeriodType> chargingSchedulePeriod;
    private ZonedDateTime startSchedule;
    private Integer duration;
    private Double minChargingRate;
    private SalesTariffType salesTariff;
}
