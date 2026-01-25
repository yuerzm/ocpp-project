package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusResponse;

public interface ChargePointTransactionsEventHandler {

    GetTransactionStatusResponse handleGetTransactionStatus(String sessionId, String identity,
                                                            GetTransactionStatusRequest request);
}
