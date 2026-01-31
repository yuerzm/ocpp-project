package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Periodic event stream params type.
 */
@Data
@NoArgsConstructor
public class PeriodicEventStreamParamsType {

    private Integer interval;
    private Integer values;

}
