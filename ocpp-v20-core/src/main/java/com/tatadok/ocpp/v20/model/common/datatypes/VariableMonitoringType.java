package com.tatadok.ocpp.v20.model.common.datatypes;

import com.tatadok.ocpp.v20.model.common.enumerations.MonitorEnumType;
import lombok.Data;

@Data
public class VariableMonitoringType {

    private Integer id;
    private Boolean transaction;
    private Double value;
    private MonitorEnumType type;
    private Integer severity;
}
