package com.cuckooy.ocpp.server;

import org.springframework.web.socket.WebSocketSession;

public interface SessionEventHandler {

    void connect(WebSocketSession session);

    void disconnect(WebSocketSession session);

    void exception(WebSocketSession session, Throwable throwable);
}
