package com.tatadok.ocpp.v21.model.common.datatypes;

import com.tatadok.ocpp.v21.model.common.enumerations.MonitorEnumType;
import com.tatadok.ocpp.v21.model.common.enumerations.SetMonitoringStatusEnumType;
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
