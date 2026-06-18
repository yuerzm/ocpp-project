package com.cuckooy.ocpp.server.handshake;

import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeFailureException;
import org.springframework.web.socket.server.HandshakeHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.util.Map;

/**
 * The type Abstract ocpp handshake handler.
 */
public abstract class AbstractOcppHandshakeHandler implements HandshakeHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final HandshakeHandler delegate;

    /**
     * Instantiates a new Abstract ocpp handshake handler.
     */
    public AbstractOcppHandshakeHandler() {
        this.delegate = new DefaultHandshakeHandler();
    }

    @Override
    public boolean doHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                               @NonNull WebSocketHandler wsHandler, @NonNull Map<String, Object> attributes)
        throws HandshakeFailureException {

        if (!doInternalHandshake(request, response, wsHandler, attributes)) {
            if (logger.isDebugEnabled()) {
                logger.debug("Handshake failed due to internal handshake failure");
            }
            return false;
        }

        return delegate.doHandshake(request, response, wsHandler, attributes);
    }

    protected abstract boolean doInternalHandshake(@NonNull ServerHttpRequest request,
                                                   @NonNull ServerHttpResponse response,
                                                   @NonNull WebSocketHandler handler,
                                                   @NonNull Map<String, Object> attributes);
}
