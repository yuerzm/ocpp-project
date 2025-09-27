package com.tatadok.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChargingSchedulePeriod {

    private Integer startPeriod;

    private Double limit;

    private Integer numberPhases = 3;

}
