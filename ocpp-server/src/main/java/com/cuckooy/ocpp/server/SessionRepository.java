package com.cuckooy.ocpp.server;

import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

public interface SessionRepository {

    Optional<WebSocketSession> get(String sessionId, String identity);

    void put(WebSocketSession session);

    void remove(WebSocketSession session);

}
