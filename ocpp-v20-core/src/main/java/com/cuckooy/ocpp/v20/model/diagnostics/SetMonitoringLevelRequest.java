package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;

@Data
public class SetMonitoringLevelRequest implements Request {

    private Integer severity;
}
