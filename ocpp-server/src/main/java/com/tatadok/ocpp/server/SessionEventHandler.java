package com.tatadok.ocpp.server;

import org.springframework.web.socket.WebSocketSession;

public interface SessionEventHandler {

    boolean authenticate(WebSocketSession session, String username, String password);

    void connect(WebSocketSession session);

    void disconnect(WebSocketSession session);
}
