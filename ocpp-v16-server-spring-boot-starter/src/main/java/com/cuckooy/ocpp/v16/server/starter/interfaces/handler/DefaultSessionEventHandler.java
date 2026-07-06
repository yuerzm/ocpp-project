package com.cuckooy.ocpp.v16.server.starter.interfaces.handler;

import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

public class DefaultSessionEventHandler implements SessionEventHandler {

    private final Logger logger = LoggerFactory.getLogger(DefaultSessionEventHandler.class);

    @Override
    public void connect(WebSocketSession session) {
        String identity = SessionAttributeHelper.getIdentity(session);
        logger.info("Handle connect, identity: {}", identity);
    }

    @Override
    public void disconnect(WebSocketSession session) {
        String identity = SessionAttributeHelper.getIdentity(session);
        logger.info("Handle disconnect, identity: {}", identity);
    }

    @Override
    public void exception(WebSocketSession session, Throwable throwable) {
        logger.error("Handle exception, session: {}", session.getId(), throwable);
    }
}
