package com.cuckooy.ocpp.v16.server.websocket;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.endpoint.AbstractWebSocketEndpoint;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;

import java.util.Collection;
import java.util.List;

/**
 * The type Ocpp 16 web socket endpoint.
 */
public class Ocpp16WebSocketEndpoint extends AbstractWebSocketEndpoint {

    /**
     * Instantiates a new Ocpp 16 web socket endpoint.
     *
     * @param ocpp16ServerTransport the ocpp 16 server transport
     * @param sessionRepository     the session repository
     * @param sessionEventHandler   the session event handler
     */
    public Ocpp16WebSocketEndpoint(Ocpp16ServerTransport ocpp16ServerTransport, SessionRepository sessionRepository,
                                   SessionEventHandler sessionEventHandler) {
        super(ocpp16ServerTransport, sessionRepository, sessionEventHandler);
    }

    @Override
    protected Collection<OcppVersion> getSupportVersions() {
        return List.of(OcppVersion.V_16);
    }
}
