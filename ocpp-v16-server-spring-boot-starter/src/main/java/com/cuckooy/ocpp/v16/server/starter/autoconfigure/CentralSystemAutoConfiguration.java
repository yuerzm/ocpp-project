package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import com.cuckooy.ocpp.core.message.UniqueIdRepository;
import com.cuckooy.ocpp.server.authentication.AuthenticationManager;
import com.cuckooy.ocpp.server.authentication.AuthenticationProvider;
import com.cuckooy.ocpp.server.authentication.BasicAuthenticationProvider;
import com.cuckooy.ocpp.server.authentication.ChargePointRegistryRepository;
import com.cuckooy.ocpp.server.authentication.ProviderManager;
import com.cuckooy.ocpp.server.promise.PromiseRepository;
import com.cuckooy.ocpp.server.provision.DefaultSessionManagerImpl;
import com.cuckooy.ocpp.server.provision.InMemoryPromiseRepositoryImpl;
import com.cuckooy.ocpp.server.provision.InMemorySessionRepositoryImpl;
import com.cuckooy.ocpp.server.provision.InMemoryUniqueIdRepositoryImpl;
import com.cuckooy.ocpp.server.session.SessionManager;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.server.starter.provision.DefaultSessionManagerTask;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeHandler;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeInterceptor;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@AutoConfiguration
@EnableConfigurationProperties(CentralSystemProperties.class)
public class CentralSystemAutoConfiguration {

    private final CentralSystemProperties centralSystemProperties;

    public CentralSystemAutoConfiguration(CentralSystemProperties centralSystemProperties) {
        this.centralSystemProperties = centralSystemProperties;
    }

    @Bean
    @ConditionalOnClass(Ocpp16HandshakeHandler.class)
    @ConditionalOnMissingBean(Ocpp16HandshakeHandler.class)
    public Ocpp16HandshakeHandler ocpp16HandshakeHandler() {
        return new Ocpp16HandshakeHandler();
    }

    @Bean
    @ConditionalOnClass(Ocpp16HandshakeInterceptor.class)
    @ConditionalOnMissingBean(Ocpp16HandshakeInterceptor.class)
    public Ocpp16HandshakeInterceptor ocpp16HandshakeInterceptor(AuthenticationManager authenticationManager) {
        return new Ocpp16HandshakeInterceptor(centralSystemProperties.getPath(), authenticationManager);
    }

    @Bean
    @ConditionalOnClass(SessionRepository.class)
    @ConditionalOnMissingBean(SessionRepository.class)
    public SessionRepository sessionRepository() {
        return new InMemorySessionRepositoryImpl();
    }

    @Bean
    @ConditionalOnClass(SessionManager.class)
    @ConditionalOnMissingBean(SessionManager.class)
    public SessionManager sessionManager(SessionRepository sessionRepository) {
        return new DefaultSessionManagerImpl(sessionRepository);
    }

    @Bean
    @ConditionalOnClass(DefaultSessionManagerTask.class)
    @ConditionalOnMissingBean(DefaultSessionManagerTask.class)
    public DefaultSessionManagerTask sessionIdleStateHandler(SessionRepository sessionRepository) {
        SessionManager sessionManager = new DefaultSessionManagerImpl(sessionRepository);
        return new DefaultSessionManagerTask(sessionManager);
    }

    @Bean
    @ConditionalOnClass(UniqueIdRepository.class)
    @ConditionalOnMissingBean(UniqueIdRepository.class)
    public UniqueIdRepository uniqueIdRepository() {
        return new InMemoryUniqueIdRepositoryImpl();
    }

    @Bean
    @ConditionalOnClass(PromiseRepository.class)
    @ConditionalOnMissingBean(PromiseRepository.class)
    public PromiseRepository promiseRepository() {
        return new InMemoryPromiseRepositoryImpl();
    }

    @Bean
    @ConditionalOnClass(AuthenticationProvider.class)
    @ConditionalOnMissingBean(AuthenticationProvider.class)
    public AuthenticationProvider authenticationProvider(ChargePointRegistryRepository chargePointRegistryRepository) {
        return new BasicAuthenticationProvider(chargePointRegistryRepository);
    }

    @Bean
    @ConditionalOnClass(AuthenticationManager.class)
    @ConditionalOnMissingBean(AuthenticationManager.class)
    public AuthenticationManager authenticationManager(List<AuthenticationProvider> providers) {
        return new ProviderManager(providers);
    }
}
