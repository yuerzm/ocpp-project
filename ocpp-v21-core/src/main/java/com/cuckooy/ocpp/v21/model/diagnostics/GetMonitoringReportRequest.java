package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.ComponentVariableType;
import com.cuckooy.ocpp.v21.model.common.enumerations.MonitoringCriterionEnumType;
import lombok.Data;

import java.util.List;

/**
 * The type Get monitoring report request.
 */
@Data
public class GetMonitoringReportRequest implements Request {

    private Integer requestId;
    private List<MonitoringCriterionEnumType> monitoringCriteria;
    private List<ComponentVariableType> componentVariable;
}
