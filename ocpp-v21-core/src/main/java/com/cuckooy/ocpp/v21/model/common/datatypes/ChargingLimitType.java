package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class ChargingLimitType {

    private String chargingLimitSource;
    private Boolean isLocalGeneration;
    private Boolean isGridCritical;
}
