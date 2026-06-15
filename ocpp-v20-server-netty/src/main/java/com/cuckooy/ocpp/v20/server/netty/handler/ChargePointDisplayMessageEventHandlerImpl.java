package com.cuckooy.ocpp.v20.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointDisplayMessageEventHandler;
import com.cuckooy.ocpp.v20.model.displaymessage.*;

public class ChargePointDisplayMessageEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointDisplayMessageEventHandler {
    public ChargePointDisplayMessageEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) { super(serverTransport, sessionRepository); }
    @Override public SetDisplayMessageResponse handleSetDisplayMessage(String identity, SetDisplayMessageRequest request) { return (SetDisplayMessageResponse) invoke(identity, request); }
    @Override public GetDisplayMessagesResponse handleGetDisplayMessages(String identity, GetDisplayMessagesRequest request) { return (GetDisplayMessagesResponse) invoke(identity, request); }
    @Override public ClearDisplayMessageResponse handleClearDisplayMessage(String identity, ClearDisplayMessageRequest request) { return (ClearDisplayMessageResponse) invoke(identity, request); }
}
