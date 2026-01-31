package com.cuckooy.ocpp.server;

import org.springframework.web.socket.WebSocketSession;

/**
 * The interface Session event handler.
 */
public interface SessionEventHandler {

    /**
     * Connect.
     *
     * @param session the session
     */
    void connect(WebSocketSession session);

    /**
     * Disconnect.
     *
     * @param session the session
     */
    void disconnect(WebSocketSession session);

    /**
     * Exception.
     *
     * @param session   the session
     * @param throwable the throwable
     */
    void exception(WebSocketSession session, Throwable throwable);
}
