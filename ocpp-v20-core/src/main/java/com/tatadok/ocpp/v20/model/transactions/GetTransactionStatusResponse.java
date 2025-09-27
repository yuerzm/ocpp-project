package com.tatadok.ocpp.v20.model.transactions;

import com.tatadok.ocpp.core.message.Response;
import lombok.Data;

@Data
public class GetTransactionStatusResponse implements Response {

    private Boolean messagesInQueue;
    private Boolean ongoingIndicator;
}
