package com.cuckooy.ocpp.v16.server.netty.example.config;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.json.OcppJsonMapper;
import com.cuckooy.ocpp.json.OcppJsonWriter;
import com.cuckooy.ocpp.json.OcppJsonWriterImpl;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonMapper;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.server.netty.Ocpp16NettyServerTransport;
import com.cuckooy.ocpp.v16.server.netty.Ocpp16NettyWebSocketHandler;
import com.cuckooy.ocpp.server.netty.ChannelAttributes;
import com.cuckooy.ocpp.server.netty.InMemorySessionRepository;
import com.cuckooy.ocpp.server.netty.OcppNettyServer;
import com.cuckooy.ocpp.server.netty.SessionEventHandler;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.server.netty.authentication.AuthenticationEventHandler;
import com.cuckooy.ocpp.server.netty.authentication.BasicAuthenticationServiceImpl;
import com.cuckooy.ocpp.server.netty.authentication.ChargePointAuthenticateRequest;
import com.cuckooy.ocpp.server.netty.authentication.ChargePointAuthenticateResponse;
import com.cuckooy.ocpp.v16.server.netty.example.service.ExampleCentralSystemService;
import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Spring configuration for OCPP v1.6 Netty server.
 * <p>
 * Wires all required beans: JSON parser/writer, authentication, session management,
 * OCPP transport, and the Netty server itself.
 */
@Configuration
@EnableConfigurationProperties(OcppNettyProperties.class)
public class OcppNettyConfiguration {

    private static final Logger log = LoggerFactory.getLogger(OcppNettyConfiguration.class);

    // ==================== JSON Beans ====================

    @Bean
    public Ocpp16JsonMapper ocpp16JsonMapper() {
        return new Ocpp16JsonMapper();
    }

    @Bean
    public Ocpp16JsonParser ocpp16JsonParser(Ocpp16JsonMapper ocpp16JsonMapper,
                                             UniqueIdRepository uniqueIdRepository) {
        return new Ocpp16JsonParser(ocpp16JsonMapper, uniqueIdRepository);
    }

    @Bean
    public OcppJsonWriter ocppJsonWriter(OcppJsonMapper ocppJsonMapper) {
        return new OcppJsonWriterImpl(ocppJsonMapper);
    }

    // ==================== Core Beans ====================

    @Bean
    public UniqueIdRepository uniqueIdRepository() {
        return new UniqueIdRepository() {
            private final ConcurrentHashMap<String, String> store = new ConcurrentHashMap<>();

            @Override
            public void save(String uniqueId, String action) {
                store.put(uniqueId, action);
            }

            @Override
            public Optional<String> retrieve(String uniqueId) {
                return Optional.ofNullable(store.get(uniqueId));
            }
        };
    }

    @Bean
    public SessionRepository sessionRepository() {
        return new InMemorySessionRepository();
    }

    // ==================== Session Event Handler ====================

    @Bean
    public SessionEventHandler sessionEventHandler() {
        return new SessionEventHandler() {
            @Override
            public void connect(Channel channel) {
                String identity = channel.attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
                log.info("Charge point connected: {}", identity);
            }

            @Override
            public void disconnect(Channel channel) {
                String identity = channel.attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
                log.info("Charge point disconnected: {}", identity);
            }

            @Override
            public void exception(Channel channel, Throwable throwable) {
                String identity = channel.attr(ChannelAttributes.CHARGE_POINT_IDENTITY).get();
                log.error("Exception for charge point {}: {}", identity, throwable.getMessage(), throwable);
            }
        };
    }

    // ==================== Authentication ====================

    @Bean
    public AuthenticationEventHandler authenticationEventHandler() {
        // Simple authentication that accepts all connections
        // In production, implement proper authentication logic (database lookup, etc.)
        return request -> {
            ChargePointAuthenticateResponse response = new ChargePointAuthenticateResponse();
            response.setIdentity(request.getIdentity());
            response.setRecognized(true);
            response.setRequired(false);
            return response;
        };
    }

    // ==================== OCPP Services ====================

    @Bean
    public ExampleCentralSystemService exampleCentralSystemService() {
        return new ExampleCentralSystemService();
    }

    // ==================== Transport & Handler ====================

    @Bean
    public Ocpp16NettyServerTransport ocpp16NettyServerTransport(
            Ocpp16JsonParser jsonParser,
            OcppJsonWriter jsonWriter,
            UniqueIdRepository uniqueIdRepository,
            ExampleCentralSystemService centralSystemService) {
        return new Ocpp16NettyServerTransport(
                jsonParser, jsonWriter, uniqueIdRepository, centralSystemService);
    }

    @Bean
    public Ocpp16NettyWebSocketHandler ocpp16NettyWebSocketHandler(
            Ocpp16NettyServerTransport serverTransport,
            SessionRepository sessionRepository,
            SessionEventHandler sessionEventHandler) {
        return new Ocpp16NettyWebSocketHandler(
                serverTransport, sessionRepository, sessionEventHandler);
    }

    // ==================== Netty Server ====================

    @Bean
    public OcppNettyServer ocppNettyServer(
            OcppNettyProperties properties,
            SessionRepository sessionRepository,
            List<Ocpp16NettyWebSocketHandler> websocketHandlers,
            AuthenticationEventHandler authenticationEventHandler,
            SessionEventHandler sessionEventHandler) {

        return new OcppNettyServer.Builder()
                .port(properties.getPort())
                .websocketPath(properties.getPath())
                .sessionRepository(sessionRepository)
                .websocketHandlers(List.copyOf(websocketHandlers))
                .authenticationEventHandler(authenticationEventHandler)
                .sessionEventHandler(sessionEventHandler)
                .bossThreads(properties.getBossThreads())
                .workerThreads(properties.getWorkerThreads() > 0
                        ? properties.getWorkerThreads()
                        : Runtime.getRuntime().availableProcessors() * 2)
                .build();
    }
}
