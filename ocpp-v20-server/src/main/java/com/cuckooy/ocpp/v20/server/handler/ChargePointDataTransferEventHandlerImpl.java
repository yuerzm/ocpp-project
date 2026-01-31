package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointDataTransferEventHandler;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.cuckooy.ocpp.v20.model.datatransfer.DataTransferResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point data transfer event handler.
 */
public class ChargePointDataTransferEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointDataTransferEventHandler {

    /**
     * Instantiates a new Charge point data transfer event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointDataTransferEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request) {
        return (DataTransferResponse) invoke(sessionId, identity, request);
    }
}
