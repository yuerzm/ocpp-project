package com.cuckooy.ocpp.server.handler;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.server.ServerTransport;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

import java.util.Optional;

/**
 * The type Abstract charge point event handler.
 */
public class AbstractChargePointEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionRepository sessionRepository;

    /**
     * Instantiates a new Abstract charge point event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public AbstractChargePointEventHandler(ServerTransport serverTransport, SessionRepository sessionRepository) {
        this.serverTransport = serverTransport;
        this.sessionRepository = sessionRepository;
    }

    /**
     * Invoke response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the response
     */
    public Response invoke(String identity, Request request) {
        Optional<WebSocketSession> optional = sessionRepository.get(identity);
        if (optional.isEmpty()) {
            logger.warn("Charge Point not connected, identity: {}", identity);
            throw new UnsupportedOperationException("Charge Point with identity " + identity + " not connected.");
        }
        return serverTransport.send(optional.get(), request);
    }
}
