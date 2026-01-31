package com.cuckooy.ocpp.v20.model.common.datatypes;

import lombok.Data;

import java.util.List;

/**
 * The type Monitoring data type.
 */
@Data
public class MonitoringDataType {

    private ComponentType component;
    private VariableType variable;
    private List<VariableMonitoringType> variableMonitoring = List.of();
}
