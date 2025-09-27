package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointTransactionsEventHandler;
import com.tatadok.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.tatadok.ocpp.v20.model.transactions.GetTransactionStatusResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointTransactionsEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointTransactionsEventHandler {

    public ChargePointTransactionsEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public GetTransactionStatusResponse handleGetTransactionStatus(String sessionId, String identity,
                                                                   GetTransactionStatusRequest request) {
        return (GetTransactionStatusResponse) invoke(sessionId, identity, request);
    }
}
