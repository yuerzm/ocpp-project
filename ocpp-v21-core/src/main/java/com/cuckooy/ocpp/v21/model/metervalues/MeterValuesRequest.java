package com.cuckooy.ocpp.v21.model.metervalues;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.MeterValueType;
import lombok.Data;

import java.util.List;

/**
 * The type Meter values request.
 */
@Data
public class MeterValuesRequest implements Request {

    private Integer evseId;
    private List<MeterValueType> meterValue;
}
