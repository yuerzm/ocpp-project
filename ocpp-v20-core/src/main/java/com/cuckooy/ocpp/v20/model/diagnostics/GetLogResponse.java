package com.cuckooy.ocpp.v20.model.diagnostics;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.LogStatusEnumType;
import lombok.Data;

/**
 * The type Get log response.
 */
@Data
public class GetLogResponse implements Response {

    private LogStatusEnumType status;
    private String filename;
    private StatusInfoType statusInfo;
}
