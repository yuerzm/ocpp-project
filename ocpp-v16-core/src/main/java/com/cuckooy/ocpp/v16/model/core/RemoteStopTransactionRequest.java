package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Request;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Remote stop transaction request.
 */
@Data
@NoArgsConstructor
public class RemoteStopTransactionRequest implements Request {

    private Integer transactionId;

    /**
     * Instantiates a new Remote stop transaction request.
     *
     * @param transactionId the transaction id
     */
    public RemoteStopTransactionRequest(Integer transactionId) {
        this.transactionId = transactionId;
    }

}
