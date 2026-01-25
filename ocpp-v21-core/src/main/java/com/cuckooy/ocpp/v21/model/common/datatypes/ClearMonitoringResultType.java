package com.cuckooy.ocpp.v21.model.common.datatypes;

import com.cuckooy.ocpp.v21.model.common.enumerations.ClearMonitoringStatusEnumType;
import lombok.Data;

@Data
public class ClearMonitoringResultType {

    private ClearMonitoringStatusEnumType status;
    private Integer id;
    private StatusInfoType statusInfo;
}
