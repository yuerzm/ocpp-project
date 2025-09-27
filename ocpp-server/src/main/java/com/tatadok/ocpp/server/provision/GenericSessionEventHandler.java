package com.tatadok.ocpp.server.provision;

import com.tatadok.ocpp.server.SessionEventHandler;
import com.tatadok.ocpp.server.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.WebSocketSession;

public abstract class GenericSessionEventHandler implements SessionEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;

    public GenericSessionEventHandler(SessionRepository sessionRepository) {
        Assert.notNull(sessionRepository, "sessionRepository must not be null");
        this.sessionRepository = sessionRepository;
    }

    @Override
    public boolean authenticate(WebSocketSession session, String username, String password) {
        logger.info("Session {} authenticate with username: {}, password: {}", session.getId(), username, password);
        return doAuthenticate(session, username, password);
    }

    protected abstract boolean doAuthenticate(WebSocketSession session, String username, String password);

    @Override
    public void connect(WebSocketSession session) {
        logger.info("Session {} connect", session.getId());
        sessionRepository.put(session);
        doConnect(session);
    }

    protected abstract void doConnect(WebSocketSession session);

    @Override
    public void disconnect(WebSocketSession session) {
        logger.info("Session {} disconnect", session.getId());
        sessionRepository.remove(session);
        doDisconnect(session);
    }

    protected abstract void doDisconnect(WebSocketSession session);
}
