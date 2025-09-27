package com.tatadok.ocpp.v20.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v20.model.common.datatypes.ReportDataType;
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
