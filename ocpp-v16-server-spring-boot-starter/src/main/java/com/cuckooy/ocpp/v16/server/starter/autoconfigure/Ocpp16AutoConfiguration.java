package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.server.SessionEventHandler;
import com.cuckooy.ocpp.server.promise.PromiseRepository;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.CentralSystemCoreEventHandler;
import com.cuckooy.ocpp.v16.handler.CentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonMapper;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonParser;
import com.cuckooy.ocpp.v16.json.Ocpp16JsonWriter;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;
import com.cuckooy.ocpp.v16.operation.Ocpp16ChargePointService;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import com.cuckooy.ocpp.v16.server.operations.Ocpp16CentralSystemServiceImpl;
import com.cuckooy.ocpp.v16.server.operations.Ocpp16ChargePointServiceImpl;
import com.cuckooy.ocpp.v16.server.provision.DefaultCentralSystemCoreEventHandler;
import com.cuckooy.ocpp.v16.server.provision.DefaultCentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v16.server.provision.DefaultSessionEventHandler;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16WebSocketEndpoint;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class Ocpp16AutoConfiguration {

    @Bean
    @ConditionalOnClass(Ocpp16WebSocketEndpoint.class)
    @ConditionalOnMissingBean(Ocpp16WebSocketEndpoint.class)
    public Ocpp16WebSocketEndpoint ocpp16WebSocketEndpoint(Ocpp16ServerTransport ocpp16ServerTransport,
                                                           SessionRepository sessionRepository,
                                                           SessionEventHandler sessionEventHandler) {
        return new Ocpp16WebSocketEndpoint(ocpp16ServerTransport, sessionRepository, sessionEventHandler);
    }

    @Bean
    @ConditionalOnClass(Ocpp16ServerTransport.class)
    @ConditionalOnMissingBean(Ocpp16ServerTransport.class)
    public Ocpp16ServerTransport ocpp16ServerTransport(Ocpp16JsonParser ocpp16JsonParser,
                                                       Ocpp16JsonWriter ocpp16JsonWriter,
                                                       PromiseRepository promiseRepository,
                                                       UniqueIdRepository uniqueIdRepository,
                                                       Ocpp16CentralSystemService ocpp16CentralSystemService) {
        return new Ocpp16ServerTransport(ocpp16JsonParser,
            ocpp16JsonWriter,
            promiseRepository,
            uniqueIdRepository,
            ocpp16CentralSystemService);
    }

    @Bean
    @ConditionalOnClass(Ocpp16JsonMapper.class)
    @ConditionalOnMissingBean(Ocpp16JsonMapper.class)
    public Ocpp16JsonMapper ocpp16JsonMapper() {
        return new Ocpp16JsonMapper();
    }

    @Bean
    @ConditionalOnClass(Ocpp16JsonParser.class)
    @ConditionalOnMissingBean(Ocpp16JsonParser.class)
    public Ocpp16JsonParser ocpp16JsonParser(Ocpp16JsonMapper ocpp16JsonMapper, UniqueIdRepository uniqueIdRepository) {
        return new Ocpp16JsonParser(ocpp16JsonMapper, uniqueIdRepository);
    }

    @Bean
    @ConditionalOnClass(Ocpp16JsonWriter.class)
    @ConditionalOnMissingBean(Ocpp16JsonWriter.class)
    public Ocpp16JsonWriter ocpp16JsonWriter(Ocpp16JsonMapper ocpp16JsonMapper) {
        return new Ocpp16JsonWriter(ocpp16JsonMapper);
    }

    @Bean
    @ConditionalOnClass(Ocpp16CentralSystemService.class)
    @ConditionalOnMissingBean(Ocpp16CentralSystemService.class)
    public Ocpp16CentralSystemService ocpp16CentralSystemService(CentralSystemCoreEventHandler coreEventHandler,
                                                                 CentralSystemFirmwareEventHandler firmwareEventHandler) {
        return new Ocpp16CentralSystemServiceImpl(coreEventHandler, firmwareEventHandler);
    }

    @Bean
    @ConditionalOnClass(Ocpp16ChargePointService.class)
    @ConditionalOnMissingBean(Ocpp16ChargePointService.class)
    public Ocpp16ChargePointService ocpp16ChargePointService(Ocpp16ServerTransport serverTransport,
                                                             SessionRepository sessionRepository) {
        return new Ocpp16ChargePointServiceImpl(serverTransport, sessionRepository);
    }

    @Bean
    @ConditionalOnClass(Ocpp16ChargePointService.class)
    @ConditionalOnMissingBean(Ocpp16ChargePointService.class)
    public CentralSystemCoreEventHandler coreEventHandler() {
        return new DefaultCentralSystemCoreEventHandler();
    }

    @Bean
    @ConditionalOnClass(CentralSystemFirmwareEventHandler.class)
    @ConditionalOnMissingBean(CentralSystemFirmwareEventHandler.class)
    public CentralSystemFirmwareEventHandler firmwareEventHandler() {
        return new DefaultCentralSystemFirmwareEventHandler();
    }

    @Bean
    @ConditionalOnClass(SessionEventHandler.class)
    @ConditionalOnMissingBean(SessionEventHandler.class)
    public SessionEventHandler sessionEventHandler() {
        return new DefaultSessionEventHandler();
    }
}
