package com.cuckooy.ocpp.server.bridge;

import org.springframework.web.socket.WebSocketSession;

/**
 * The interface Message bridging service.
 */
public interface MessageBridgingService {

    /**
     * On message.
     *
     * @param session the session
     * @param message the message
     */
    void onMessage(WebSocketSession session, String message);
}
