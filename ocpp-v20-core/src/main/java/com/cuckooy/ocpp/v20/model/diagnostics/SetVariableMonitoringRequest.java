package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.SetMonitoringDataType;
import lombok.Data;

import java.util.List;

@Data
public class SetVariableMonitoringRequest implements Request {

    private List<SetMonitoringDataType> setMonitoringData;
}
