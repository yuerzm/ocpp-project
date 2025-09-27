package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointDataTransferEventHandler;
import com.tatadok.ocpp.v20.model.datatransfer.DataTransferRequest;
import com.tatadok.ocpp.v20.model.datatransfer.DataTransferResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointDataTransferEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointDataTransferEventHandler {

    public ChargePointDataTransferEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                   SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request) {
        return (DataTransferResponse) invoke(sessionId, identity, request);
    }
}
