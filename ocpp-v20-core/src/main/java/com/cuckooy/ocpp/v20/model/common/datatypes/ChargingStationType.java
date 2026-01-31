package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

/**
 * The type Charging station type.
 */
@Data
public class ChargingStationType {

    private String model;
    private String vendorName;
    private String firmwareVersion;
    private ModemType modem;
    private String serialNumber;
}
