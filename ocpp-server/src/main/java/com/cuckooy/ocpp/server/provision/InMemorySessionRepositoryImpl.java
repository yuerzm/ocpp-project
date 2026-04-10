package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type In memory session repository.
 */
public class InMemorySessionRepositoryImpl implements SessionRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();

    @Override
    public Optional<WebSocketSession> get(String identity) {
        return Optional.ofNullable(sessions.get(identity));
    }

    @Override
    public void put(WebSocketSession session) {
        String identity = SessionAttributeHelper.getIdentity(session);

        sessions.compute(identity, (key, oldSession) -> {
            if (oldSession != null && oldSession.isOpen()) {
                closeQuietly(oldSession);
            }
            return session;
        });
    }

    @Override
    public void remove(WebSocketSession session) {
        String identity = SessionAttributeHelper.getIdentity(session);

        sessions.computeIfPresent(identity, (key, currentSession) -> {
            if (currentSession == session) {
                closeQuietly(currentSession);
                return null;
            }
            return currentSession;
        });
    }

    private void closeQuietly(WebSocketSession session) {
        try {
            session.close();
        } catch (IOException e) {
            String identity = SessionAttributeHelper.getIdentity(session);
            logger.warn("Quietly close session failed. identity: {}", identity, e);
        }
    }
}