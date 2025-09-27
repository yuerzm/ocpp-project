package com.tatadok.ocpp.v21.model.common.datatypes;

import lombok.Data;

import java.util.List;

@Data
public class MonitoringDataType {

    private ComponentType component;
    private VariableType variable;
    private List<VariableMonitoringType> variableMonitoring = List.of();
}
