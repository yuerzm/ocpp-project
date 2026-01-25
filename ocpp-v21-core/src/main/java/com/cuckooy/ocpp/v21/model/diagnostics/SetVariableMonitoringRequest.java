package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.SetMonitoringDataType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariableMonitoringRequest implements Request {

    private List<SetMonitoringDataType> setMonitoringData;
}
