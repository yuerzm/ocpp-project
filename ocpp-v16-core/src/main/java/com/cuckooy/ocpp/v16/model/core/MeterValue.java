package com.cuckooy.ocpp.v16.model.core;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
public class MeterValue {

    private Instant timestamp;

    private List<SampledValue> sampledValue;
}
