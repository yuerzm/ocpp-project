package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Data
public class BatteryDataType {

    private Integer evseId;
    private String serialNumber;
    private BigDecimal soC;
    private BigDecimal soH;
    private ZonedDateTime productionDate;
    private String vendorInfo;
}
