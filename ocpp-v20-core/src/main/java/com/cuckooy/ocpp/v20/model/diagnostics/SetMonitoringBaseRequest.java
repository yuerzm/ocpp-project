package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.enumerations.MonitoringBaseEnumType;
import lombok.Data;

/**
 * The type Set monitoring base request.
 */
@Data
public class SetMonitoringBaseRequest implements Request {

    private MonitoringBaseEnumType monitoringBase;
}
