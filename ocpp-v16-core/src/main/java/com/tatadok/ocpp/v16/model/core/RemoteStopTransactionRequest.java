package com.tatadok.ocpp.v16.model.core;

import com.tatadok.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RemoteStopTransactionRequest implements Request {

    private Integer transactionId;

    public RemoteStopTransactionRequest(Integer transactionId) {
        this.transactionId = transactionId;
    }

}
