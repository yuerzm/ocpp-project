package com.cuckooy.ocpp.v16.server.netty;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.netty.OcppNettyWebSocketHandler;
import com.cuckooy.ocpp.server.netty.SessionEventHandler;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.server.netty.ServerTransport;

import java.util.List;

/**
 * OCPP 1.6 WebSocket handler for Netty.
 * <p>
 * Supports OCPP protocol version {@link OcppVersion#V_16} ("ocpp1.6").
 */
public class Ocpp16NettyWebSocketHandler extends OcppNettyWebSocketHandler {

    public Ocpp16NettyWebSocketHandler(Ocpp16NettyServerTransport serverTransport,
                                      SessionRepository sessionRepository,
                                      SessionEventHandler sessionEventHandler) {
        super(serverTransport, sessionRepository, sessionEventHandler);
    }

    @Override
    public List<OcppVersion> getSupportedVersions() {
        return List.of(OcppVersion.V_16);
    }
}
