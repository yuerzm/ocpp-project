package com.tatadok.ocpp.v21.model.remote;

import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.v21.model.common.datatypes.StatusInfoType;
import com.tatadok.ocpp.v21.model.common.enumerations.RequestStartStopStatusEnumType;
import lombok.Data;

@Data
public class RequestStopTransactionResponse implements Response {

    private RequestStartStopStatusEnumType status;
    private StatusInfoType statusInfo;
}
