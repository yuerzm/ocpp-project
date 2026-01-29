package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ChargingRateUnitEnumType;
import lombok.Data;

import java.math.BigDecimal;
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

    private BigDecimal powerTolerance;
    private Integer signatureId;
    private String digestValue;
    private Boolean useLocalTime;
    private Integer randomizedDelay;
    private AbsolutePriceScheduleType absolutePriceSchedule;
    private PriceLevelScheduleType priceLevelSchedule;
    private LimitAtSoCType limitAtSoC;
}
