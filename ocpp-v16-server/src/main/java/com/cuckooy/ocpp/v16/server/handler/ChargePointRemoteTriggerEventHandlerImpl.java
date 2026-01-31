package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointRemoteTriggerEventHandler;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.cuckooy.ocpp.v16.model.remotetrigger.TriggerMessageResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointRemoteTriggerEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointRemoteTriggerEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointRemoteTriggerEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public TriggerMessageResponse handleTriggerMessage(String sessionId, String identity,
                                                       TriggerMessageRequest request) {
        return (TriggerMessageResponse) invoke(sessionId, identity, request);
    }
}
