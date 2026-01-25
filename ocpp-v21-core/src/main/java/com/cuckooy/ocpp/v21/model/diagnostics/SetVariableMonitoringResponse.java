package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v21.model.common.datatypes.SetMonitoringResultType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariableMonitoringResponse implements Response {

    private List<SetMonitoringResultType> setMonitoringResult;
}
