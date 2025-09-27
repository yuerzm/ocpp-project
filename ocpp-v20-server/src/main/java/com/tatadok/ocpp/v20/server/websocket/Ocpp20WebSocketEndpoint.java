package com.tatadok.ocpp.v20.server.websocket;

import com.tatadok.ocpp.core.message.OcppVersion;
import com.tatadok.ocpp.server.SessionEventHandler;
import com.tatadok.ocpp.server.endpoint.AbstractWebSocketEndpoint;
import com.tatadok.ocpp.v20.server.Ocpp20ServerTransport;

import java.util.Collection;
import java.util.List;

public class Ocpp20WebSocketEndpoint extends AbstractWebSocketEndpoint {

    public Ocpp20WebSocketEndpoint(Ocpp20ServerTransport ocpp20ServerTransport,
                                   SessionEventHandler sessionEventHandler) {
        super(ocpp20ServerTransport, sessionEventHandler);
    }

    @Override
    protected Collection<OcppVersion> getSupportVersions() {
        return List.of(OcppVersion.V_20, OcppVersion.V_201);
    }
}
