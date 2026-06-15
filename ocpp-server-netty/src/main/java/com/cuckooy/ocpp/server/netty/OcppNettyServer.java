package com.cuckooy.ocpp.server.netty;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.server.netty.authentication.AuthenticationEventHandler;
import com.cuckooy.ocpp.server.netty.handshake.NettyOcppHandshakeHandler;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.MultiThreadIoEventLoopGroup;
import io.netty.channel.nio.NioIoHandler;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class OcppNettyServer {

    private static final Logger logger = LoggerFactory.getLogger(OcppNettyServer.class);

    private static final int DEFAULT_PORT = 8080;
    private static final String DEFAULT_WEBSOCKET_PATH = "/websocket";
    private static final int MAX_HTTP_CONTENT_LENGTH = 65536;
    private static final int READER_IDLE_TIMEOUT_SECONDS = 60;

    private final int port;
    private final String websocketPath;
    private final SessionRepository sessionRepository;
    private final List<OcppNettyWebSocketHandler> websocketHandlers;
    private final AuthenticationEventHandler authenticationEventHandler;
    private final SessionEventHandler sessionEventHandler;
    private final int bossThreads;
    private final int workerThreads;

    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private ChannelFuture serverChannelFuture;

    private OcppNettyServer(Builder builder) {
        this.port = builder.port;
        this.websocketPath = builder.websocketPath;
        this.sessionRepository = builder.sessionRepository;
        this.websocketHandlers = builder.websocketHandlers;
        this.authenticationEventHandler = builder.authenticationEventHandler;
        this.sessionEventHandler = builder.sessionEventHandler;
        this.bossThreads = builder.bossThreads;
        this.workerThreads = builder.workerThreads;
    }

    public void start() {
        logger.info("Starting OCPP Netty Server on port {} with websocket path '{}'", port, websocketPath);

        // Boss group: 1 thread for accepting connections
        bossGroup = new MultiThreadIoEventLoopGroup(bossThreads, NioIoHandler.newFactory());

        // Worker group: N threads for I/O and business logic
        workerGroup = new MultiThreadIoEventLoopGroup(workerThreads, NioIoHandler.newFactory());

        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap
                .group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 128)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childHandler(new OcppChannelInitializer());

            serverChannelFuture = bootstrap.bind(port).sync();
            logger.info("OCPP Netty Server started on port {}", port);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Server start interrupted", e);
            shutdown();
        }
    }

    public void shutdown() {
        logger.info("Shutting down OCPP Netty Server...");

        try {
            if (serverChannelFuture != null) {
                serverChannelFuture.channel().close().sync();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
        }
        if (bossGroup != null) {
            bossGroup.shutdownGracefully();
        }

        logger.info("OCPP Netty Server shut down");
    }

    private class OcppChannelInitializer extends ChannelInitializer<SocketChannel> {

        @Override
        protected void initChannel(SocketChannel ch) {
            ch
                .pipeline()
                .addLast(new HttpServerCodec())
                .addLast(new HttpObjectAggregator(MAX_HTTP_CONTENT_LENGTH))
                .addLast(new NettyOcppHandshakeHandler(websocketPath,
                    authenticationEventHandler,
                    getAllSupportedVersions()))
                .addLast(new WebSocketServerProtocolHandler(websocketPath,
                    getSubProtocolNames(),
                    true,
                    MAX_HTTP_CONTENT_LENGTH))
                .addLast(new IdleStateHandler(READER_IDLE_TIMEOUT_SECONDS, 0, 0, TimeUnit.SECONDS))
                .addLast(new ProtocolRoutingWebSocketHandler(websocketHandlers,
                    sessionRepository,
                    sessionEventHandler));
        }
    }

    private List<OcppVersion> getAllSupportedVersions() {
        return websocketHandlers.stream().flatMap(h -> h.getSupportedVersions().stream()).distinct().toList();
    }

    private String getSubProtocolNames() {
        return getAllSupportedVersions().stream().map(OcppVersion::getValue).reduce((a, b) -> a + "," + b).orElse("");
    }

    public int getPort() {
        return port;
    }

    public String getWebsocketPath() {
        return websocketPath;
    }

    public static class Builder {

        private int port = DEFAULT_PORT;
        private String websocketPath = DEFAULT_WEBSOCKET_PATH;
        private SessionRepository sessionRepository;
        private List<OcppNettyWebSocketHandler> websocketHandlers;
        private AuthenticationEventHandler authenticationEventHandler;
        private SessionEventHandler sessionEventHandler;
        private int bossThreads = 1;
        private int workerThreads = Runtime.getRuntime().availableProcessors() * 2;

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder websocketPath(String websocketPath) {
            this.websocketPath = websocketPath;
            return this;
        }

        public Builder sessionRepository(SessionRepository sessionRepository) {
            this.sessionRepository = sessionRepository;
            return this;
        }

        public Builder websocketHandlers(List<OcppNettyWebSocketHandler> websocketHandlers) {
            this.websocketHandlers = websocketHandlers;
            return this;
        }

        public Builder authenticationEventHandler(AuthenticationEventHandler authenticationEventHandler) {
            this.authenticationEventHandler = authenticationEventHandler;
            return this;
        }

        public Builder sessionEventHandler(SessionEventHandler sessionEventHandler) {
            this.sessionEventHandler = sessionEventHandler;
            return this;
        }

        public Builder bossThreads(int bossThreads) {
            this.bossThreads = bossThreads;
            return this;
        }

        public Builder workerThreads(int workerThreads) {
            this.workerThreads = workerThreads;
            return this;
        }

        public OcppNettyServer build() {
            Objects.requireNonNull(sessionRepository, "sessionRepository must not be null");
            Objects.requireNonNull(websocketHandlers, "websocketHandlers must not be null");
            if (websocketHandlers.isEmpty()) {
                throw new IllegalArgumentException("websocketHandlers must not be empty");
            }
            Objects.requireNonNull(authenticationEventHandler, "authenticationEventHandler must not be null");
            Objects.requireNonNull(sessionEventHandler, "sessionEventHandler must not be null");
            if (port <= 0) {
                throw new IllegalArgumentException("port must be positive");
            }
            return new OcppNettyServer(this);
        }
    }
}
