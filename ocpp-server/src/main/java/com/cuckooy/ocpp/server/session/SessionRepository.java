package com.cuckooy.ocpp.server.session;

import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

/**
 * The interface Session repository.
 */
public interface SessionRepository {

    /**
     * Get optional.
     *
     * @param identity the identity
     * @return the optional
     */
    Optional<WebSocketSession> get(String identity);

    /**
     * Put.
     *
     * @param session the session
     */
    void put(WebSocketSession session);

    /**
     * Remove.
     *
     * @param session the session
     */
    void remove(WebSocketSession session);

}
