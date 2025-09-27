package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

import java.util.List;

@Data
public class ClearVariableMonitoringRequest implements Request {

    private List<Integer> ids;
}
