package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.MonitorEnumType;
import com.cuckooy.ocpp.v20.model.common.enumerations.SetMonitoringStatusEnumType;
import lombok.Data;

@Data
public class SetMonitoringResultType {

    private SetMonitoringStatusEnumType status;
    private MonitorEnumType type;
    private Integer severity;
    private ComponentType component;
    private VariableType variable;
    private Integer id;
    private StatusInfoType statusInfo;
}
