package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v21.model.common.enumerations.GenericStatusEnumType;
import lombok.Data;

/**
 * The type Adjust periodic event stream response.
 */
@Data
public class AdjustPeriodicEventStreamResponse implements Response {

    private GenericStatusEnumType status;
    private StatusInfoType statusInfo;
}
