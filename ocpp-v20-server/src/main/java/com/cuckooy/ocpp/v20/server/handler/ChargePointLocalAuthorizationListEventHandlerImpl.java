package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointLocalAuthorizationListEventHandler;
import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v20.model.localauth.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListRequest;
import com.cuckooy.ocpp.v20.model.localauth.SendLocalListResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

/**
 * The type Charge point local authorization list event handler.
 */
public class ChargePointLocalAuthorizationListEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointLocalAuthorizationListEventHandler {

    /**
     * Instantiates a new Charge point local authorization list event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointLocalAuthorizationListEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                             SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public SendLocalListResponse handleSendLocalList(String identity, SendLocalListRequest request) {
        return (SendLocalListResponse) invoke(identity, request);
    }

    @Override
    public GetLocalListVersionResponse handleGetLocalListVersion(String identity, GetLocalListVersionRequest request) {
        return (GetLocalListVersionResponse) invoke(identity, request);
    }
}
