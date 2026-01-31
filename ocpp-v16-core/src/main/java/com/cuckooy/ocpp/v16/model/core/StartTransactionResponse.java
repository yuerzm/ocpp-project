package com.cuckooy.ocpp.v16.model.core;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Start transaction response.
 */
@Data
@NoArgsConstructor
public class StartTransactionResponse implements Response {

    private IdTagInfo idTagInfo;

    private Integer transactionId;

    /**
     * Instantiates a new Start transaction response.
     *
     * @param idTagInfo     the id tag info
     * @param transactionId the transaction id
     */
    public StartTransactionResponse(IdTagInfo idTagInfo, Integer transactionId) {
        this.idTagInfo = idTagInfo;
        this.transactionId = transactionId;
    }

}
