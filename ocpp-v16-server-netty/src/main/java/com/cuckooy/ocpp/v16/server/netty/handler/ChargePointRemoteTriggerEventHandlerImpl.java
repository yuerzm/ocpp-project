package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointRemoteTriggerEventHandler;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageResponse;

public class ChargePointRemoteTriggerEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointRemoteTriggerEventHandler {

    public ChargePointRemoteTriggerEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public TriggerMessageResponse handleTriggerMessage(String identity, TriggerMessageRequest request) {
        return (TriggerMessageResponse) invoke(identity, request);
    }
}
