package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * The type Meter values request.
 */
@Data
@NoArgsConstructor
public class MeterValuesRequest implements Request {

    private Integer connectorId;

    private Integer transactionId;

    private List<MeterValue> meterValue;
}
