package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.transactions.TransactionEventRequest;
import com.cuckooy.ocpp.v20.model.transactions.TransactionEventResponse;

/**
 * The interface Central system transactions event handler.
 */
public interface CentralSystemTransactionsEventHandler {

    /**
     * Handle transaction event transaction event response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the transaction event response
     */
    TransactionEventResponse handleTransactionEvent(String identity, TransactionEventRequest request);

}

