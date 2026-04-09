package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusResponse;

/**
 * The interface Charge point transactions event handler.
 */
public interface ChargePointTransactionsEventHandler {

    /**
     * Handle get transaction status get transaction status response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get transaction status response
     */
    GetTransactionStatusResponse handleGetTransactionStatus(String identity, GetTransactionStatusRequest request);
}
