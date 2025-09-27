package com.tatadok.ocpp.v20.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v20.handler.ChargePointAuthorizationEventHandler;
import com.tatadok.ocpp.v20.model.authorization.ClearCacheRequest;
import com.tatadok.ocpp.v20.model.authorization.ClearCacheResponse;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointAuthorizationEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointAuthorizationEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointAuthorizationEventHandlerImpl(Ocpp20ServerTransport serverTransport,
                                                    SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ClearCacheResponse handleClearCache(String sessionId, String identity, ClearCacheRequest request) {
        return (ClearCacheResponse) invoke(sessionId, identity, request);
    }
}
