package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.MonitoringDataType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class NotifyMonitoringReportRequest implements Request {

    private Integer requestId;
    private Boolean tbc = false;
    private Integer seqNo;
    private ZonedDateTime generatedAt;
    private List<MonitoringDataType> monitor = null;
}
