package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointLocalAuthorizationListEventHandler;
import com.cuckooy.ocpp.v20.model.localauth.*;

public class ChargePointLocalAuthorizationListEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointLocalAuthorizationListEventHandler {
    public ChargePointLocalAuthorizationListEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public SendLocalListResponse handleSendLocalList(String identity, SendLocalListRequest request) { return (SendLocalListResponse) invoke(identity, request); }
    @Override public GetLocalListVersionResponse handleGetLocalListVersion(String identity, GetLocalListVersionRequest request) { return (GetLocalListVersionResponse) invoke(identity, request); }
}
