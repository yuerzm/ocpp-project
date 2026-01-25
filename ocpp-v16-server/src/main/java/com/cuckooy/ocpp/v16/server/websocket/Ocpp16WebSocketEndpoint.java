package com.cuckooy.ocpp.v16.server.websocket;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.endpoint.AbstractWebSocketEndpoint;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;

import java.util.Collection;
import java.util.List;

public class Ocpp16WebSocketEndpoint extends AbstractWebSocketEndpoint {

    public Ocpp16WebSocketEndpoint(Ocpp16ServerTransport ocpp16ServerTransport,
                                   SessionEventHandler sessionEventHandler) {
        super(ocpp16ServerTransport, sessionEventHandler);
    }

    @Override
    protected Collection<OcppVersion> getSupportVersions() {
        return List.of(OcppVersion.V_16);
    }
}
