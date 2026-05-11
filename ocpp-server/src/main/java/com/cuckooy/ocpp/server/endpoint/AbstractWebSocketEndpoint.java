package com.cuckooy.ocpp.server.endpoint;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.ServerTransport;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.concurrent.ConcurrentWebSocketHandler;
import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import com.cuckooy.ocpp.server.session.SessionRepository;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.SubProtocolCapable;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * The type Abstract web socket endpoint.
 */
public abstract class AbstractWebSocketEndpoint extends ConcurrentWebSocketHandler implements SubProtocolCapable {

    /**
     * The Logger.
     */
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionEventHandler sessionEventHandler;

    /**
     * Instantiates a new Abstract web socket endpoint.
     *
     * @param serverTransport     the server transport
     * @param sessionRepository   the session repository
     * @param sessionEventHandler the session event handler
     */
    public AbstractWebSocketEndpoint(ServerTransport serverTransport, SessionRepository sessionRepository,
                                     SessionEventHandler sessionEventHandler) {
        super(sessionRepository);
        Assert.notNull(serverTransport, "serverTransport must not be null");
        Assert.notNull(sessionEventHandler, "SessionEventHandler must not be null");
        this.serverTransport = serverTransport;
        this.sessionEventHandler = sessionEventHandler;
    }

    @Override
    protected void onConnect(WebSocketSession session) throws Exception {
        logger.info("Charge Point connected, identity: {}", SessionAttributeHelper.getIdentity(session));

        sessionEventHandler.connect(session);
    }

    @Override
    protected void onDisconnect(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        logger.info("Charge Point disconnect, identity: {}", SessionAttributeHelper.getIdentity(session));

        sessionEventHandler.disconnect(session);
    }

    @Override
    public void onMessage(WebSocketSession session, TextMessage message) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Handle TextMessage, session: {}, message: {}", session.getId(), message.getPayload());
        }

        serverTransport.receive(session, message.getPayload());
    }

    @Override
    protected void onException(WebSocketSession session, Throwable throwable) throws Exception {
        logger.error("Occurred an exception: {}", throwable.getMessage(), throwable);

        sessionEventHandler.exception(session, throwable);
    }

    /**
     * Support boolean.
     *
     * @param protocol the protocol
     * @return the boolean
     */
    public boolean support(String protocol) {
        return getSupportVersions().stream().map(OcppVersion::getValue).anyMatch(x -> Objects.equals(x, protocol));
    }

    /**
     * Gets support versions.
     *
     * @return the support versions
     */
    protected abstract Collection<OcppVersion> getSupportVersions();

    @Override
    public @NonNull List<String> getSubProtocols() {
        return getSupportVersions().stream().map(OcppVersion::getValue).toList();
    }
}
