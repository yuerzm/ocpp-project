package com.cuckooy.ocpp.v20.server.netty;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.netty.OcppNettyWebSocketHandler;
import com.cuckooy.ocpp.server.netty.SessionEventHandler;
import com.cuckooy.ocpp.server.netty.SessionRepository;

import java.util.List;

/**
 * OCPP 2.0.1 WebSocket handler for Netty.
 * <p>
 * Supports OCPP protocol version {@link OcppVersion#V_201} ("ocpp2.0.1").
 */
public class Ocpp20NettyWebSocketHandler extends OcppNettyWebSocketHandler {

    public Ocpp20NettyWebSocketHandler(Ocpp20NettyServerTransport serverTransport,
                                      SessionRepository sessionRepository,
                                      SessionEventHandler sessionEventHandler) {
        super(serverTransport, sessionRepository, sessionEventHandler);
    }

    @Override
    public List<OcppVersion> getSupportedVersions() {
        return List.of(OcppVersion.V_201);
    }
}
