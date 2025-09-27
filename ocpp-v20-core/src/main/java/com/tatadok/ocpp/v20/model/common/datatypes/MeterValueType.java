package com.tatadok.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class MeterValueType {

    private List<SampledValueType> sampledValue;
    private ZonedDateTime timestamp;
}
