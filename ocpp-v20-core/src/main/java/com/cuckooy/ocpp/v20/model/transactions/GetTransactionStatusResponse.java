package com.cuckooy.ocpp.v20.model.transactions;

import com.cuckooy.ocpp.core.message.Response;
import lombok.Data;

@Data
public class GetTransactionStatusResponse implements Response {

    private Boolean messagesInQueue;
    private Boolean ongoingIndicator;
}
