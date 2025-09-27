package com.tatadok.ocpp.v21.model.provisioning;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.enumerations.ReportBaseEnumType;
import lombok.Data;

@Data
public class GetBaseReportRequest implements Request {

    private Integer requestId;
    private ReportBaseEnumType reportBase;
}
