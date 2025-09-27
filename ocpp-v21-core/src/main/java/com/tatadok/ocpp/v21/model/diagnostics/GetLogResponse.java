package com.tatadok.ocpp.v21.model.diagnostics;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.LogStatusEnumType;
import lombok.Data;

@Data
public class GetLogResponse implements Response {

    private LogStatusEnumType status;
    private String filename;
    private StatusInfoType statusInfo;
}
