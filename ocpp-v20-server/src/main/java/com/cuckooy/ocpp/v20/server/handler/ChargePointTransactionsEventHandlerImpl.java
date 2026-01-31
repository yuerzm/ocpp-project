package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointTransactionsEventHandler;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusRequest;
import com.cuckooy.ocpp.v20.model.transactions.GetTransactionStatusResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point transactions event handler.
 */
public class ChargePointTransactionsEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointTransactionsEventHandler {

    /**
     * Instantiates a new Charge point transactions event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
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
