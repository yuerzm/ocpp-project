package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.Optional;

public class AbstractChargePointEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionRepository sessionRepository;

    public AbstractChargePointEventHandler(ServerTransport serverTransport, SessionRepository sessionRepository) {
        Objects.requireNonNull(serverTransport, "serverTransport cannot be null");
        Objects.requireNonNull(sessionRepository, "sessionRepository cannot be null");
        this.serverTransport = serverTransport;
        this.sessionRepository = sessionRepository;
    }

    public Response invoke(String identity, Request request) {
        Optional<Channel> optional = sessionRepository.get(identity);
        if (optional.isEmpty()) {
            logger.warn("Charge Point not connected, identity: {}", identity);
            throw new UnsupportedOperationException("Charge Point with identity " + identity + " not connected.");
        }
        return serverTransport.send(optional.get(), request);
    }
}
