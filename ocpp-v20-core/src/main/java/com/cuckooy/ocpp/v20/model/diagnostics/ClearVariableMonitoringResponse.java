package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.ClearMonitoringResultType;
import lombok.Data;

import java.util.List;

@Data
public class ClearVariableMonitoringResponse implements Response {

    private List<ClearMonitoringResultType> clearMonitoringResults;
}
