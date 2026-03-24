package com.cuckooy.ocpp.server.bridge;

import org.springframework.web.socket.WebSocketSession;

/**
 * The type Noop message bridging service.
 */
public class NoopMessageBridgingService implements MessageBridgingService {

    @Override
    public void onMessage(WebSocketSession session, String message) {

    }
}
