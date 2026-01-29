package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class BatteryDataType {

    private Integer evseId;
    private String serialNumber;
    private BigDecimal soC;
    private BigDecimal soH;
    private Instant productionDate;
    private String vendorInfo;
}
