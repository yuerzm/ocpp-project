package com.cuckooy.ocpp.v21.model.common.datatypes;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PeriodicEventStreamParamsType {

    private Integer interval;
    private Integer values;

}
