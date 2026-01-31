package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

/**
 * The type Set monitoring level request.
 */
@Data
public class SetMonitoringLevelRequest implements Request {

    private Integer severity;
}
