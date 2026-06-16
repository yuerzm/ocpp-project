package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.session.SessionManager;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.PingMessage;

import java.io.IOException;

/**
 * The type Default session manager.
 */
public class DefaultSessionManagerImpl implements SessionManager {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final SessionRepository sessionRepository;

    /**
     * Instantiates a new Default session manager.
     *
     * @param sessionRepository the session repository
     */
    public DefaultSessionManagerImpl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public void handle() {
        sessionRepository.getSessions().forEach(session -> {
            try {
                PingMessage message = new PingMessage();
                if (logger.isDebugEnabled()) {
                    logger.info("Handle session {} ping message: {}", session.getId(), message.getPayload());
                }
                session.sendMessage(message);
            } catch (IOException e) {
                logger.error(e.getMessage(), e);
            }
        });
    }
}
