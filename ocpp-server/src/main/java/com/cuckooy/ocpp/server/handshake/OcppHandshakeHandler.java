package com.cuckooy.ocpp.server.handshake;

import com.cuckooy.ocpp.server.endpoint.AbstractWebSocketEndpoint;
import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.util.CollectionUtils;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.server.HandshakeFailureException;
import org.springframework.web.socket.server.HandshakeHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The type Ocpp handshake handler.
 */
public class OcppHandshakeHandler implements HandshakeHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final HandshakeHandler delegate;
    private final List<AbstractWebSocketEndpoint> endpoints;

    /**
     * Instantiates a new Ocpp handshake handler.
     *
     * @param endpoints the endpoints
     */
    public OcppHandshakeHandler(List<AbstractWebSocketEndpoint> endpoints) {
        this.delegate = new DefaultHandshakeHandler();
        this.endpoints = endpoints;
    }

    @Override
    public boolean doHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                               @NonNull WebSocketHandler handler, @NonNull Map<String, Object> attributes)
        throws HandshakeFailureException {

        String identity = attributes.get(SessionAttributeHelper.CHARGE_POINT_IDENTITY).toString();

        WebSocketHttpHeaders webSocketHttpHeaders = new WebSocketHttpHeaders(request.getHeaders());
        List<String> protocols = webSocketHttpHeaders.getSecWebSocketProtocol();

        if (CollectionUtils.isEmpty(protocols)) {
            logger.error("No protocol (OCPP version) is specified.");
            response.setStatusCode(HttpStatus.BAD_REQUEST);
            return false;
        }

        AbstractWebSocketEndpoint endpoint = selectEndpoint(protocols);
        if (Objects.isNull(endpoint)) {
            logger.error("None of the requested protocols '{}' is supported", protocols);
            response.setStatusCode(HttpStatus.NOT_FOUND);
            return false;
        }

        attributes.put(SessionAttributeHelper.CHARGE_POINT_PROTOCOL, protocols);

        logger.debug("Charge Point identity '{}' will be using {}", identity, endpoint.getClass().getSimpleName());
        return delegate.doHandshake(request, response, endpoint, attributes);
    }

    private AbstractWebSocketEndpoint selectEndpoint(List<String> requestedProtocols) {
        for (String requiredProtocol : requestedProtocols) {
            for (AbstractWebSocketEndpoint item : endpoints) {
                if (item.support(requiredProtocol)) {
                    return item;
                }
            }
        }
        return null;
    }
}
