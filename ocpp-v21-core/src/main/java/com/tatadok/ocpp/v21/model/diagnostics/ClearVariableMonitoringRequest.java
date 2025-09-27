package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

import java.util.List;

@Data
public class ClearVariableMonitoringRequest implements Request {

    private List<Integer> ids;
}
