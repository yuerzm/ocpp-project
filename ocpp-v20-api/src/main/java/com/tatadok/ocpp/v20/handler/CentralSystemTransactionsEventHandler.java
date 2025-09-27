package com.tatadok.ocpp.v20.handler;

import com.tatadok.ocpp.v20.model.transactions.TransactionEventRequest;
import com.tatadok.ocpp.v20.model.transactions.TransactionEventResponse;

public interface CentralSystemTransactionsEventHandler {

    TransactionEventResponse handleTransactionEvent(String sessionId, String identity, TransactionEventRequest request);

}

