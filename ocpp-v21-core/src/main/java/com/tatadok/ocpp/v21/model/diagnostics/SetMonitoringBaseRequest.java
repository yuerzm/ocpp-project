package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.enumerations.MonitoringBaseEnumType;
import lombok.Data;

@Data
public class SetMonitoringBaseRequest implements Request {

    private MonitoringBaseEnumType monitoringBase;
}
