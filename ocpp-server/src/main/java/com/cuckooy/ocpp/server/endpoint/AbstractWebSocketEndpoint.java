package com.cuckooy.ocpp.server.endpoint;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.ServerTransport;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.concurrent.ConcurrentWebSocketHandler;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.SubProtocolCapable;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class AbstractWebSocketEndpoint extends ConcurrentWebSocketHandler implements SubProtocolCapable {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionEventHandler sessionEventHandler;

    public AbstractWebSocketEndpoint(ServerTransport serverTransport, SessionEventHandler sessionEventHandler) {
        this.serverTransport = serverTransport;
        this.sessionEventHandler = sessionEventHandler;
    }

    @Override
    protected void onConnect(WebSocketSession session) throws Exception {
        sessionEventHandler.connect(session);
    }

    @Override
    protected void onDisconnect(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        sessionEventHandler.disconnect(session);
    }

    @Override
    public void onMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {

        if (message instanceof TextMessage textMessage) {
            if (logger.isDebugEnabled()) {
                logger.debug("Handle TextMessage, session: {}, message: {}", session.getId(), textMessage.getPayload());
            }
            handleTextMessage(session, textMessage);
            return;
        }

        if (message instanceof PongMessage) {
            if (logger.isDebugEnabled()) {
                logger.debug("Handle PongMessage, session: {}", session.getId());
            }
            handlePongMessage(session, (PongMessage) message);
            return;
        }

        if (message instanceof BinaryMessage) {
            logger.warn("Handle BinaryMessage, session: {}", session.getId());
            session.close(CloseStatus.NOT_ACCEPTABLE.withReason("Binary messages not supported"));
            return;
        }

        throw new IllegalStateException("Unexpected WebSocket message type: " + message);
    }

    private void handleTextMessage(WebSocketSession session, TextMessage textMessage) throws Exception {
        serverTransport.receive(session, textMessage.getPayload());
    }

    @Override
    protected void onException(WebSocketSession session, Throwable throwable) throws Exception {
        logger.error("Occurred an exception: {}", throwable.getMessage(), throwable);
    }

    protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {
        logger.info("Handle pong message: {}", message);
    }

    public boolean support(String protocol) {
        return getSupportVersions().stream().map(OcppVersion::getValue).anyMatch(x -> Objects.equals(x, protocol));
    }

    protected abstract Collection<OcppVersion> getSupportVersions();

    @Override
    public @NonNull List<String> getSubProtocols() {
        return getSupportVersions().stream().map(OcppVersion::getValue).toList();
    }
}
