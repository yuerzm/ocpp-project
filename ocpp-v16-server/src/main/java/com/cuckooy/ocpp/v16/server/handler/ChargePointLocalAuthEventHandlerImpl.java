package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointLocalAuthEventHandler;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.GetLocalListVersionResponse;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListRequest;
import com.cuckooy.ocpp.v16.model.localauthlist.SendLocalListResponse;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point local auth event handler.
 */
public class ChargePointLocalAuthEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointLocalAuthEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point local auth event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointLocalAuthEventHandlerImpl(Ocpp16ServerTransport serverTransport,
                                                SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }


    @Override
    public GetLocalListVersionResponse handleGetLocalListVersion(String identity, GetLocalListVersionRequest request) {
        return (GetLocalListVersionResponse) invoke(identity, request);
    }

    @Override
    public SendLocalListResponse handleSendLocalList(String identity, SendLocalListRequest request) {
        return (SendLocalListResponse) invoke(identity, request);
    }
}
