package com.cuckooy.ocpp.v16.model.security;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.v16.model.security.types.LogEnumType;
import com.cuckooy.ocpp.v16.model.security.types.LogParametersType;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Get log request.
 */
@Data
@NoArgsConstructor
public class GetLogRequest implements Request {

    private LogEnumType logType;
    private Integer requestId;
    private Integer retries;
    private Integer retryInterval;
    private LogParametersType log;
}
