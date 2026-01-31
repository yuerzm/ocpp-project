package com.cuckooy.ocpp.server.provision;

import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type In memory session repository.
 */
public class InMemorySessionRepositoryImpl implements SessionRepository {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final Map<String, WebSocketSession> sessions = new ConcurrentHashMap<>();
    private final Map<String, String> identities = new ConcurrentHashMap<>();

    @Override
    public Optional<WebSocketSession> get(String sessionId, String identity) {
        WebSocketSession session = null;
        if (StringUtils.isNotBlank(sessionId)) {
            session = sessions.get(sessionId);
        }
        if (Objects.isNull(session) && StringUtils.isNotBlank(identity)) {
            String identitySessionId = identities.get(identity);
            session = sessions.get(identitySessionId);
        }
        return Optional.ofNullable(session);
    }

    @Override
    public synchronized void put(WebSocketSession session) {
        String identity = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_IDENTITY).toString();
        identities.put(identity, session.getId());
        sessions.put(session.getId(), session);
    }

    @Override
    public synchronized void remove(WebSocketSession session) {
        String identity = session.getAttributes().get(SessionAttributeHelper.CHARGE_POINT_IDENTITY).toString();
        identities.remove(identity);
        WebSocketSession removed = sessions.remove(session.getId());
        try {
            removed.close();
        } catch (IOException e) {
            logger.error("Exception occurred when removing the session and closing it.", e);
        }
    }

}
