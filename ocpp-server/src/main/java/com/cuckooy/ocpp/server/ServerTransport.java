package com.cuckooy.ocpp.server;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import org.springframework.web.socket.WebSocketSession;

/**
 * The interface Server transport.
 */
public interface ServerTransport {

    /**
     * Receive.
     *
     * @param session the session
     * @param message the message
     */
    void receive(WebSocketSession session, String message);

    /**
     * Send response.
     *
     * @param session the session
     * @param request the request
     * @return the response
     */
    Response send(WebSocketSession session, Request request);

}
