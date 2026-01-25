package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.transactions.TransactionEventRequest;
import com.cuckooy.ocpp.v20.model.transactions.TransactionEventResponse;

public interface CentralSystemTransactionsEventHandler {

    TransactionEventResponse handleTransactionEvent(String sessionId, String identity, TransactionEventRequest request);

}

