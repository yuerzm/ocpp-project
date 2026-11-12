package com.cuckooy.ocpp.server.logger;

import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.WebSocketSession;

/**
 * The type Stdio message logging service.
 */
public class StdioMessageLoggingService implements MessageLoggingService {

    private static final String OCPP_LOGGER = "OCPP.Logger";

    private final Logger ocppLogger = LoggerFactory.getLogger(OCPP_LOGGER);

    @Override
    public void log(WebSocketSession session, String message) {
        String identity = SessionAttributeHelper.getIdentity(session);
        Object protocol = SessionAttributeHelper.getProtocol(session);
        ocppLogger.info("Identity:\t{},\nSession:\t{},\nEndpoint:\t{},\nProtocol:\t{},\nMessage:\t{}",
            identity,
            session.getId(),
            session.getUri(),
            protocol,
            message);
    }
}
