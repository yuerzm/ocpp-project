package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.v16.handler.ChargePointLocalAuthEventHandler;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointLocalAuthEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointLocalAuthEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointLocalAuthEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }


    @Override
    public GetLocalListVersionResponse handleGetLocalListVersion(String sessionId, String identity,
                                                                 GetLocalListVersionRequest request) {
        return (GetLocalListVersionResponse) invoke(sessionId, identity, request);
    }

    @Override
    public SendLocalListResponse handleSendLocalList(String sessionId, String identity, SendLocalListRequest request) {
        return (SendLocalListResponse) invoke(sessionId, identity, request);
    }
}
