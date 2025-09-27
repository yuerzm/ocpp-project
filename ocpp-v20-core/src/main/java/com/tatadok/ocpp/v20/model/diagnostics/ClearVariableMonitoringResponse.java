package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v20.model.common.datatypes.ClearMonitoringResultType;
import lombok.Data;

import java.util.List;

@Data
public class ClearVariableMonitoringResponse implements Response {

    private List<ClearMonitoringResultType> clearMonitoringResults;
}
