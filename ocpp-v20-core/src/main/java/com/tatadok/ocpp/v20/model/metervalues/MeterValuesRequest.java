package com.tatadok.ocpp.v20.model.metervalues;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.MeterValueType;
import lombok.Data;

import java.util.List;

@Data
public class MeterValuesRequest implements Request {

    private Integer evseId;
    private List<MeterValueType> meterValue;
}
