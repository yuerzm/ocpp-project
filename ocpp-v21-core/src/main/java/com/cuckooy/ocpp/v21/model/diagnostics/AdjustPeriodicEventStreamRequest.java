package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.PeriodicEventStreamParamsType;
import lombok.Data;

@Data
public class AdjustPeriodicEventStreamRequest implements Request {

    private Integer id;
    private PeriodicEventStreamParamsType params;
}
