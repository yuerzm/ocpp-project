package com.tatadok.ocpp.v16.model.security;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.v16.model.security.types.LogEnumType;
import com.tatadok.ocpp.v16.model.security.types.LogParametersType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GetLogRequest implements Request {

    private LogEnumType logType;
    private Integer requestId;
    private Integer retries;
    private Integer retryInterval;
    private LogParametersType log;
}
