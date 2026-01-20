package com.tatadok.ocpp.v16.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v16.handler.ChargePointRemoteTriggerEventHandler;
import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageRequest;
import com.tatadok.ocpp.v16.model.remotetrigger.TriggerMessageResponse;
import com.tatadok.ocpp.v16.server.Ocpp16ServerTransport;
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
