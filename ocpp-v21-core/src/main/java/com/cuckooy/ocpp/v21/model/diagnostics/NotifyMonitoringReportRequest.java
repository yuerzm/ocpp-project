package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.MonitoringDataType;
import lombok.Data;

import java.time.Instant;
import java.util.List;

/**
 * The type Notify monitoring report request.
 */
@Data
public class NotifyMonitoringReportRequest implements Request {

    private Integer requestId;
    private Boolean tbc = false;
    private Integer seqNo;
    private Instant generatedAt;
    private List<MonitoringDataType> monitor = null;
}
