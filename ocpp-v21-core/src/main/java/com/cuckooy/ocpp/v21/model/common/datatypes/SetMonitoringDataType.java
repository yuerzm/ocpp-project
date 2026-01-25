package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.MonitorEnumType;
import lombok.Data;

@Data
public class SetMonitoringDataType {

    private Double value;
    private MonitorEnumType type;
    private Integer severity;
    private ComponentType component;
    private VariableType variable;
    private Integer id;
    private Boolean transaction = false;
}
