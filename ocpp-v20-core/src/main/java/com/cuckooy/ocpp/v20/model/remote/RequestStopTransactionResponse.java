package com.cuckooy.ocpp.v20.model.remote;

import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v20.model.common.datatypes.StatusInfoType;
import com.cuckooy.ocpp.v20.model.common.enumerations.RequestStartStopStatusEnumType;
import lombok.Data;

/**
 * The type Request stop transaction response.
 */
@Data
public class RequestStopTransactionResponse implements Response {

    private RequestStartStopStatusEnumType status;
    private StatusInfoType statusInfo;
}
