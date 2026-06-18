package com.cuckooy.ocpp.v20.server.websocket;

import com.cuckooy.ocpp.server.authentication.AuthenticationManager;
import com.cuckooy.ocpp.server.handshake.AbstractOcppHandshakeInterceptor;
import org.jspecify.annotations.NonNull;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;

import java.util.Map;

public class Ocpp20HandshakeInterceptor extends AbstractOcppHandshakeInterceptor {

    public Ocpp20HandshakeInterceptor(AuthenticationManager authenticateManager) {
        super(authenticateManager);
    }

    public Ocpp20HandshakeInterceptor(String path, AuthenticationManager authenticateManager) {
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
