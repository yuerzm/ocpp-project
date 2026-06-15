package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointDataTransferEventHandler;
import com.cuckooy.ocpp.v20.model.datatransfer.*;

public class ChargePointDataTransferEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointDataTransferEventHandler {
    public ChargePointDataTransferEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request) { return (DataTransferResponse) invoke(identity, request); }
}
