package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Charging schedule period.
 */
@Data
@NoArgsConstructor
public class ChargingSchedulePeriod {

    private Integer startPeriod;

    private Double limit;

    private Integer numberPhases = 3;

}
