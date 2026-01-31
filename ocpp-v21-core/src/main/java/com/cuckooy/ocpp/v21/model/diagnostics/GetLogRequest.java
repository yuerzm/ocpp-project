package com.cuckooy.ocpp.v21.model.diagnostics;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v21.model.common.datatypes.LogParametersType;
import com.cuckooy.ocpp.v21.model.common.enumerations.LogEnumType;
import lombok.Data;

/**
 * The type Get log request.
 */
@Data
public class GetLogRequest implements Request {

    private Integer requestId;
    private LogEnumType logType;
    private LogParametersType log;
    private Integer retries;
    private Integer retryInterval;
}
