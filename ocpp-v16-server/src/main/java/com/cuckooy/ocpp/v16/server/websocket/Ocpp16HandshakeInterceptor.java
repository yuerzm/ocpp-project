package com.cuckooy.ocpp.v16.server.websocket;

import com.cuckooy.ocpp.server.authentication.AuthenticationManager;
import com.cuckooy.ocpp.server.handshake.AbstractOcppHandshakeInterceptor;
import org.jspecify.annotations.NonNull;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;

import java.util.Map;

public class Ocpp16HandshakeInterceptor extends AbstractOcppHandshakeInterceptor {

    public Ocpp16HandshakeInterceptor(String path, AuthenticationManager authenticateManager) {
        super(path, authenticateManager);
    }

    @Override
    protected boolean doInternalBeforeHandshake(@NonNull ServerHttpRequest request,
                                                @NonNull ServerHttpResponse response,
                                                @NonNull WebSocketHandler wsHandler,
                                                @NonNull Map<String, Object> attributes) throws Exception {
        return true;
    }

    @Override
    protected void doInternalAfterHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                            @NonNull WebSocketHandler wsHandler, Exception exception) {
    }
}
