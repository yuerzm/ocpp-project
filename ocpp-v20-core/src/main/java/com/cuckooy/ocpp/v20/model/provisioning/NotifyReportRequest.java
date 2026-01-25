package com.cuckooy.ocpp.v20.model.provisioning;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v20.model.common.datatypes.ReportDataType;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Data
public class NotifyReportRequest implements Request {

    private Integer requestId;
    private ZonedDateTime generatedAt;
    private Integer seqNo;
    private Boolean tbc = false;
    private List<ReportDataType> reportData;
}
