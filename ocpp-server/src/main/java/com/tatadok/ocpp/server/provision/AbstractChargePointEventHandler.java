package com.tatadok.ocpp.server.provision;

import com.tatadok.ocpp.core.message.Request;
import com.tatadok.ocpp.core.message.Response;
import com.tatadok.ocpp.server.ServerTransport;
import com.tatadok.ocpp.server.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

public class AbstractChargePointEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionRepository sessionRepository;

    public AbstractChargePointEventHandler(ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.serverTransport = serverTransport;
        this.sessionRepository = sessionRepository;
    }

    public Response invoke(String sessionId, String identity, Request request) {
        Optional<WebSocketSession> optional = sessionRepository.get(sessionId, identity);
        if (optional.isEmpty()) {
            logger.warn("Session not connected, session: {}, identity: {}", sessionId, identity);
            throw new UnsupportedOperationException("Session with id " + sessionId + " not connected.");
        }
        return serverTransport.send(optional.get(), request);
    }
}
