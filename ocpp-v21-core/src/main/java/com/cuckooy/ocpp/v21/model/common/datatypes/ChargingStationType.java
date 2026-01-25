package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class ChargingStationType {

    private String model;
    private String vendorName;
    private String firmwareVersion;
    private ModemType modem;
    private String serialNumber;
}
