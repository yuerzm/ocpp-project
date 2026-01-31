package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;

/**
 * The type Unit of measure.
 */
@Data
public class UnitOfMeasure {

    private String unit;
    private Integer multiplier;
}
