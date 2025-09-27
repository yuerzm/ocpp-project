package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointLocalAuthorizationListEventHandler;
import com.tatadok.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.tatadok.ocpp.v20.model.localauth.GetLocalListVersionResponse;
import com.tatadok.ocpp.v20.model.localauth.SendLocalListRequest;
import com.tatadok.ocpp.v20.model.localauth.SendLocalListResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

public class ChargePointLocalAuthorizationListEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointLocalAuthorizationListEventHandler {

    public ChargePointLocalAuthorizationListEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                             SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SendLocalListResponse handleSendLocalList(String sessionId, String identity, SendLocalListRequest request) {
        return (SendLocalListResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetLocalListVersionResponse handleGetLocalListVersion(String sessionId, String identity,
                                                                 GetLocalListVersionRequest request) {
        return (GetLocalListVersionResponse) invoke(sessionId, identity, request);
    }
}
