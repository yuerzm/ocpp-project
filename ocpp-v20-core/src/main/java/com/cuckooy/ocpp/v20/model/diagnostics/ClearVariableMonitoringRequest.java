package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.util.List;

@Data
public class ClearVariableMonitoringRequest implements Request {

    private List<Integer> ids;
}
