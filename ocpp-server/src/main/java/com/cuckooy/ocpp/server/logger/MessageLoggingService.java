package com.cuckooy.ocpp.server.logger;

import org.springframework.web.socket.WebSocketSession;

/**
 * The interface Message logging service.
 */
public interface MessageLoggingService {

    /**
     * log message.
     *
     * @param session the session
     * @param message the message
     */
    void log(WebSocketSession session, String message);
}
