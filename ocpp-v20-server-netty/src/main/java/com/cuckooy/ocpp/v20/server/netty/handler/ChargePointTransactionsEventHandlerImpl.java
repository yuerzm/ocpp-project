package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointTransactionsEventHandler;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusResponse;

public class ChargePointTransactionsEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointTransactionsEventHandler {
    public ChargePointTransactionsEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public GetTransactionStatusResponse handleGetTransactionStatus(String identity, GetTransactionStatusRequest request) { return (GetTransactionStatusResponse) invoke(identity, request); }
}
