package com.cuckooy.ocpp.v20.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.handler.ChargePointAuthorizationEventHandler;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheRequest;
import com.cuckooy.ocpp.v20.model.authorization.ClearCacheResponse;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point authorization event handler.
 */
public class ChargePointAuthorizationEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointAuthorizationEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point authorization event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointAuthorizationEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request) {
        return (ClearCacheResponse) invoke(identity, request);
    }
}
