package com.cuckooy.ocpp.v16.server.websocket;

import com.cuckooy.ocpp.server.handshake.AbstractOcppHandshakeHandler;
import org.jspecify.annotations.NonNull;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;

import java.util.Map;

/**
 * The type Ocpp 16 handshake handler.
 */
public class Ocpp16HandshakeHandler extends AbstractOcppHandshakeHandler {

    @Override
    protected boolean doInternalHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                          @NonNull WebSocketHandler wsHandler,
                                          @NonNull Map<String, Object> attributes) {
        return true;
    }
}
