package com.cuckooy.ocpp.v21.model.transactions;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

/**
 * The type Get transaction status response.
 */
@Data
public class GetTransactionStatusResponse implements Response {

    private Boolean messagesInQueue;
    private Boolean ongoingIndicator;
}
