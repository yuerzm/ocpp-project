package com.cuckooy.ocpp.v20.model.common.datatypes;

import com.cuckooy.ocpp.v20.model.common.enumerations.MonitorEnumType;
import lombok.Data;

/**
 * The type Variable monitoring type.
 */
@Data
public class VariableMonitoringType {

    private Integer id;
    private Boolean transaction;
    private Double value;
    private MonitorEnumType type;
    private Integer severity;
}
