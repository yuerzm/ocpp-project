package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Ev energy offer type.
 */
@Data
public class EVEnergyOfferType {

    private EVPowerScheduleType evPowerSchedule;
    private EVAbsolutePriceScheduleType evAbsolutePriceSchedule;
}
