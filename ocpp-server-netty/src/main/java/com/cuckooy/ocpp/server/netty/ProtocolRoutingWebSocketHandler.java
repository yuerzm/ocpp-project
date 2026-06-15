package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.message.OcppVersion;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

public class ProtocolRoutingWebSocketHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private static final Logger logger = LoggerFactory.getLogger(ProtocolRoutingWebSocketHandler.class);

    private final List<OcppNettyWebSocketHandler> handlers;
    private final SessionRepository sessionRepository;
    private final SessionEventHandler sessionEventHandler;

    public ProtocolRoutingWebSocketHandler(List<OcppNettyWebSocketHandler> handlers,
                                           SessionRepository sessionRepository,
                                           SessionEventHandler sessionEventHandler) {
        this.handlers = Objects.requireNonNull(handlers);
        this.sessionRepository = Objects.requireNonNull(sessionRepository);
        this.sessionEventHandler = Objects.requireNonNull(sessionEventHandler);
    }

    private OcppNettyWebSocketHandler selectHandler(ChannelHandlerContext ctx) {
        String protocol = ctx.channel().attr(ChannelAttributes.CHARGE_POINT_PROTOCOL).get();
        if (protocol == null) {
            throw new IllegalStateException("No OCPP protocol negotiated for channel: " + ctx.channel().id());
        }

        for (OcppNettyWebSocketHandler handler : handlers) {
            for (OcppVersion version : handler.getSupportedVersions()) {
                if (protocol.contains(version.getValue())) {
                    return handler;
                }
            }
        }

        throw new IllegalStateException("No handler found for protocol: " + protocol);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Channel active: {}", ctx.channel().id().asShortText());
        }
        super.channelActive(ctx);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        if (logger.isDebugEnabled()) {
            logger.debug("Channel inactive: {}", ctx.channel().id().asShortText());
        }

        String identity = ctx.channel().attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
        logger.info("Charge Point disconnected, identity: {}", identity);

        sessionRepository.remove(ctx.channel());
        sessionEventHandler.disconnect(ctx.channel());

        super.channelInactive(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame frame) throws Exception {
        selectHandler(ctx).channelRead(ctx, frame.retain());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        logger.error("Occurred an exception: {}", cause.getMessage(), cause);
        sessionEventHandler.exception(ctx.channel(), cause);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler.HandshakeComplete) {
            if (logger.isDebugEnabled()) {
                logger.debug("WebSocket handshake completed, channel: {}", ctx.channel().id().asShortText());
            }

            sessionRepository.put(ctx.channel());

            String identity = ctx.channel().attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
            logger.info("Charge Point connected, identity: {}", identity);

            sessionEventHandler.connect(ctx.channel());
        }
        super.userEventTriggered(ctx, evt);
    }
}
