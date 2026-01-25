package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.SessionRepository;
import com.cuckooy.ocpp.server.provision.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v20.handler.ChargePointDisplayMessageEventHandler;
import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.ClearDisplayMessageResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.GetDisplayMessagesResponse;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageRequest;
import com.cuckooy.ocpp.v20.model.displaymessage.SetDisplayMessageResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointDisplayMessageEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointDisplayMessageEventHandler {

    public ChargePointDisplayMessageEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                     SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SetDisplayMessageResponse handleSetDisplayMessage(String sessionId, String identity,
                                                             SetDisplayMessageRequest request) {
        return (SetDisplayMessageResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetDisplayMessagesResponse handleGetDisplayMessages(String sessionId, String identity,
                                                               GetDisplayMessagesRequest request) {
        return (GetDisplayMessagesResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ClearDisplayMessageResponse handleClearDisplayMessage(String sessionId, String identity,
                                                                 ClearDisplayMessageRequest request) {
        return (ClearDisplayMessageResponse) invoke(sessionId, identity, request);
    }
}
