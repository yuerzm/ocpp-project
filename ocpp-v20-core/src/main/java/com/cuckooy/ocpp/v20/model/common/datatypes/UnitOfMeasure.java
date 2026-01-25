package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

@Data
public class UnitOfMeasure {

    private String unit;
    private Integer multiplier;
}
