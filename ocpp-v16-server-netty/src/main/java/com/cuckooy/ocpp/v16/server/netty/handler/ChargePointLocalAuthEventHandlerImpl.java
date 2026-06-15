package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointLocalAuthEventHandler;
import com.cuckooy.ocpp.v16.model.localauthlist.*;

public class ChargePointLocalAuthEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointLocalAuthEventHandler {

    public ChargePointLocalAuthEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public GetLocalListVersionResponse handleGetLocalListVersion(String identity, GetLocalListVersionRequest request) {
        return (GetLocalListVersionResponse) invoke(identity, request);
    }

    @Override
    public SendLocalListResponse handleSendLocalList(String identity, SendLocalListRequest request) {
        return (SendLocalListResponse) invoke(identity, request);
    }
}
