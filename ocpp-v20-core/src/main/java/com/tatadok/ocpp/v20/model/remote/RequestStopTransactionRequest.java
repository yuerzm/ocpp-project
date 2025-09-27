package com.tatadok.ocpp.v20.model.remote;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;

@Data
public class RequestStopTransactionRequest implements Request {

    private String transactionId;
}
