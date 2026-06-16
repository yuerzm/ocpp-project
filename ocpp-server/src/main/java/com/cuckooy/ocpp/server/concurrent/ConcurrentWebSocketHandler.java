package com.cuckooy.ocpp.server.concurrent;

import com.cuckooy.ocpp.server.session.SessionRepository;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.ConcurrentWebSocketSessionDecorator;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * The type Concurrent web socket handler.
 */
public abstract class ConcurrentWebSocketHandler extends TextWebSocketHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final int SEND_TIME_LIMIT = 3 * 1000;
    private static final int BUFFER_SIZE_LIMIT = 512 * 1024;

    private final SessionRepository sessionRepository;

    /**
     * Instantiates a new Concurrent web socket handler.
     *
     * @param sessionRepository the session repository
     */
    protected ConcurrentWebSocketHandler(SessionRepository sessionRepository) {
        Assert.notNull(sessionRepository, "sessionRepository must not be null");
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void afterConnectionEstablished(@NonNull WebSocketSession session) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("After connection established session: {}", session.getId());
        }

        ConcurrentWebSocketSessionDecorator wrapped =
            new ConcurrentWebSocketSessionDecorator(session, SEND_TIME_LIMIT, BUFFER_SIZE_LIMIT);

        sessionRepository.put(wrapped);

        this.onConnect(wrapped);
    }

    @Override
    protected void handleTextMessage(@NonNull WebSocketSession session, @NonNull TextMessage textMessage)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session: {}, message: {}", session.getId(), textMessage);
        }

        this.onMessage(sessionRepository.get(session), textMessage);
    }

    @Override
    protected void handlePongMessage(@NonNull WebSocketSession session, @NonNull PongMessage message) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session {}, pong message: {}", session.getId(), message.getPayload());
        }
    }

    @Override
    public void handleTransportError(@NonNull WebSocketSession session, @NonNull Throwable exception) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session {}, transport error: ", session.getId(), exception);
        }

        this.onException(sessionRepository.get(session), exception);
    }

    @Override
    public void afterConnectionClosed(@NonNull WebSocketSession session, @NonNull CloseStatus closeStatus)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("After connection closed session: {}, status: {}", session.getId(), closeStatus);
        }

        sessionRepository.remove(session);

        this.onDisconnect(session, closeStatus);
    }

    /**
     * On connect.
     *
     * @param session the session
     * @throws Exception the exception
     */
    protected abstract void onConnect(WebSocketSession session) throws Exception;

    /**
     * On disconnect.
     *
     * @param session     the session
     * @param closeStatus the close status
     * @throws Exception the exception
     */
    protected abstract void onDisconnect(WebSocketSession session, CloseStatus closeStatus) throws Exception;

    /**
     * On message.
     *
     * @param session the session
     * @param message the message
     * @throws Exception the exception
     */
    protected abstract void onMessage(WebSocketSession session, TextMessage message) throws Exception;

    /**
     * On exception.
     *
     * @param session   the session
     * @param throwable the throwable
     * @throws Exception the exception
     */
    protected abstract void onException(WebSocketSession session, Throwable throwable) throws Exception;

}
