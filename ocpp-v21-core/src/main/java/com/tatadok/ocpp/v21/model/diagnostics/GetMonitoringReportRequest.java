package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.ComponentVariableType;
import com.tatadok.ocpp.v21.model.common.enumerations.MonitoringCriterionEnumType;
import lombok.Data;

import java.util.List;

@Data
public class GetMonitoringReportRequest implements Request {

    private Integer requestId;
    private List<MonitoringCriterionEnumType> monitoringCriteria;
    private List<ComponentVariableType> componentVariable;
}
