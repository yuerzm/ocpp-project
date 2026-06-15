package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointAuthorizationEventHandler;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheResponse;

public class ChargePointAuthorizationEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointAuthorizationEventHandler {
    public ChargePointAuthorizationEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request) { return (ClearCacheResponse) invoke(identity, request); }
}
