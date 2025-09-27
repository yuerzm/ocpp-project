package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v21.model.common.datatypes.LogParametersType;
import com.tatadok.ocpp.v21.model.common.enumerations.LogEnumType;
import lombok.Data;

@Data
public class GetLogRequest implements Request {

    private Integer requestId;
    private LogEnumType logType;
    private LogParametersType log;
    private Integer retries;
    private Integer retryInterval;
}
