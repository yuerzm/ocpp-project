package com.tatadok.ocpp.server;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import org.springframework.web.socket.WebSocketSession;

public interface ServerTransport {

    void receive(WebSocketSession session, String message);

    Response send(WebSocketSession session, Request request);

}
