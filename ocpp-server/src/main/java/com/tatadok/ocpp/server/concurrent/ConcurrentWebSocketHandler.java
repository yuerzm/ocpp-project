package com.tatadok.ocpp.server.concurrent;

import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.ConcurrentWebSocketSessionDecorator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public abstract class ConcurrentWebSocketHandler implements WebSocketHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final int SEND_TIME_LIMIT = (int) TimeUnit.SECONDS.toMillis(10);
    private static final int BUFFER_SIZE_LIMIT = 5 * 8388608;

    private final Map<String, ConcurrentWebSocketSessionDecorator> sessions = new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(@NonNull WebSocketSession session) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("After connection established session: {}", session.getId());
        }
        this.onConnect(getConcurrentSession(session));
    }

    @Override
    public void handleMessage(@NonNull WebSocketSession session, @NonNull WebSocketMessage<?> message)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session: {}, message: {}", session.getId(), message.getPayload());
        }
        this.onMessage(getConcurrentSession(session), message);
    }

    @Override
    public void handleTransportError(@NonNull WebSocketSession session, @NonNull Throwable exception) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session {}, transport error: ", session.getId(), exception);
        }
        this.onException(getConcurrentSession(session), exception);
    }

    @Override
    public void afterConnectionClosed(@NonNull WebSocketSession session, @NonNull CloseStatus closeStatus)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("After connection closed session: {}, status: {}", session.getId(), closeStatus);
        }
        this.onDisconnect(sessions.remove(session.getId()), closeStatus);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    private ConcurrentWebSocketSessionDecorator getConcurrentSession(WebSocketSession session) {
        return sessions.computeIfAbsent(session.getId(),
            sessionId -> new ConcurrentWebSocketSessionDecorator(session, SEND_TIME_LIMIT, BUFFER_SIZE_LIMIT));
    }

    protected abstract void onConnect(WebSocketSession session) throws Exception;

    protected abstract void onDisconnect(WebSocketSession session, CloseStatus closeStatus) throws Exception;

    protected abstract void onMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception;

    protected abstract void onException(WebSocketSession session, Throwable throwable) throws Exception;

}
