package com.cuckooy.ocpp.v20.server.websocket;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.endpoint.AbstractWebSocketEndpoint;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v20.server.Ocpp20ServerTransport;

import java.util.Collection;
import java.util.List;

/**
 * The type Ocpp 20 web socket endpoint.
 */
public class Ocpp20WebSocketEndpoint extends AbstractWebSocketEndpoint {

    /**
     * Instantiates a new Ocpp 20 web socket endpoint.
     *
     * @param ocpp20ServerTransport the ocpp 20 server transport
     * @param sessionRepository     the session repository
     * @param sessionEventHandler   the session event handler
     */
    public Ocpp20WebSocketEndpoint(Ocpp20ServerTransport ocpp20ServerTransport, SessionRepository sessionRepository,
                                   SessionEventHandler sessionEventHandler) {
        super(ocpp20ServerTransport, sessionRepository, sessionEventHandler);
    }

    @Override
    protected Collection<OcppVersion> getSupportVersions() {
        return List.of(OcppVersion.V_201);
    }
}
