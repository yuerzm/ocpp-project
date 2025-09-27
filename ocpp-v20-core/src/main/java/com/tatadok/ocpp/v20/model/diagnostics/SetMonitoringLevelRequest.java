package com.tatadok.ocpp.v20.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class SetMonitoringLevelRequest implements Request {

    private Integer severity;
}
