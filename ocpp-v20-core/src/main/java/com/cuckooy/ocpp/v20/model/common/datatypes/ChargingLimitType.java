package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.ChargingLimitSourceEnumType;
import lombok.Data;

/**
 * The type Charging limit type.
 */
@Data
public class ChargingLimitType {

    private ChargingLimitSourceEnumType chargingLimitSource;
    private Boolean isGridCritical;
}
