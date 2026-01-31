package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Charging limit type.
 */
@Data
public class ChargingLimitType {

    private String chargingLimitSource;
    private Boolean isLocalGeneration;
    private Boolean isGridCritical;
}
