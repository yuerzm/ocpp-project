package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

@Data
public class AdditionalSelectedServicesType {

    private String serviceName;
    private RationalNumberType serviceFee;
}
