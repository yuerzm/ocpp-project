package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.message.OcppVersion;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

public abstract class OcppNettyWebSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ServerTransport serverTransport;
    private final SessionRepository sessionRepository;
    private final SessionEventHandler sessionEventHandler;

    protected OcppNettyWebSocketHandler(ServerTransport serverTransport, SessionRepository sessionRepository,
                                        SessionEventHandler sessionEventHandler) {
        Objects.requireNonNull(serverTransport, "serverTransport must not be null");
        Objects.requireNonNull(sessionRepository, "sessionRepository must not be null");
        Objects.requireNonNull(sessionEventHandler, "sessionEventHandler must not be null");
        this.serverTransport = serverTransport;
        this.sessionRepository = sessionRepository;
        this.sessionEventHandler = sessionEventHandler;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame frame) throws Exception {
        String message = frame.text();
        if (logger.isDebugEnabled()) {
            logger.debug("Handle TextWebSocketFrame, channel: {}, message: {}",
                ctx.channel().id().asShortText(),
                message);
        }
        serverTransport.receive(ctx.channel(), message);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        logger.error("Occurred an exception: {}", cause.getMessage(), cause);
        sessionEventHandler.exception(ctx.channel(), cause);
    }

    public abstract List<OcppVersion> getSupportedVersions();

    public ServerTransport getServerTransport() {
        return serverTransport;
    }

    public SessionRepository getSessionRepository() {
        return sessionRepository;
    }

    public SessionEventHandler getSessionEventHandler() {
        return sessionEventHandler;
    }
}
