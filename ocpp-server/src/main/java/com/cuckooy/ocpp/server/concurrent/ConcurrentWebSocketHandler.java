package com.cuckooy.ocpp.server.concurrent;

import com.cuckooy.ocpp.server.session.SessionRepository;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.ConcurrentWebSocketSessionDecorator;

/**
 * The type Concurrent web socket handler.
 */
public abstract class ConcurrentWebSocketHandler implements WebSocketHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final int SEND_TIME_LIMIT = 3000;
    private static final int BUFFER_SIZE_LIMIT = 1024 * 1024;

    /**
     * The Session repository.
     */
    protected final SessionRepository sessionRepository;

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

        WebSocketSession wrapped = wrapSession(session);

        this.onConnect(wrapped);
    }

    @Override
    public void handleMessage(@NonNull WebSocketSession session, @NonNull WebSocketMessage<?> message)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session: {}, message: {}", session.getId(), message.getPayload());
        }

        this.onMessage(session, message);
    }

    @Override
    public void handleTransportError(@NonNull WebSocketSession session, @NonNull Throwable exception) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle session {}, transport error: ", session.getId(), exception);
        }

        this.onException(session, exception);
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

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

    private WebSocketSession wrapSession(WebSocketSession session) {
        WebSocketSession wrapped = new ConcurrentWebSocketSessionDecorator(session, SEND_TIME_LIMIT, BUFFER_SIZE_LIMIT);
        sessionRepository.put(wrapped);
        return wrapped;
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
    protected abstract void onMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception;

    /**
     * On exception.
     *
     * @param session   the session
     * @param throwable the throwable
     * @throws Exception the exception
     */
    protected abstract void onException(WebSocketSession session, Throwable throwable) throws Exception;

}
