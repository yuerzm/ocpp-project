package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

import java.util.List;

/**
 * The type Clear variable monitoring request.
 */
@Data
public class ClearVariableMonitoringRequest implements Request {

    private List<Integer> ids;
}
