package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Additional selected services type.
 */
@Data
public class AdditionalSelectedServicesType {

    private String serviceName;
    private RationalNumberType serviceFee;
}
