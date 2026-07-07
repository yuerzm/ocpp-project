package com.cuckooy.ocpp.v16.server.starter.autoconfigure;

import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeHandler;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeInterceptor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.DelegatingWebSocketConfiguration;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@AutoConfiguration
@Import(DelegatingWebSocketConfiguration.class)
@ConditionalOnClass(WebSocketConfigurer.class)
@ConditionalOnMissingBean(WebSocketAutoConfiguration.class)
public class WebSocketAutoConfiguration implements WebSocketConfigurer {

    private final CentralSystemProperties centralSystemProperties;
    private final WebSocketHandler webSocketHandler;
    private final Ocpp16HandshakeHandler ocpp16HandshakeHandler;
    private final Ocpp16HandshakeInterceptor ocpp16HandshakeInterceptor;

    public WebSocketAutoConfiguration(CentralSystemProperties centralSystemProperties,
                                      WebSocketHandler webSocketHandler, Ocpp16HandshakeHandler ocpp16HandshakeHandler,
                                      Ocpp16HandshakeInterceptor ocpp16HandshakeInterceptor) {
        this.centralSystemProperties = centralSystemProperties;
        this.webSocketHandler = webSocketHandler;
        this.ocpp16HandshakeHandler = ocpp16HandshakeHandler;
        this.ocpp16HandshakeInterceptor = ocpp16HandshakeInterceptor;
    }

    @Bean
    @ConditionalOnClass(ServerEndpointExporter.class)
    @ConditionalOnMissingBean(ServerEndpointExporter.class)
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    @ConditionalOnClass(ServletServerContainerFactoryBean.class)
    @ConditionalOnMissingBean(ServletServerContainerFactoryBean.class)
    public ServletServerContainerFactoryBean servletServerContainerFactoryBean() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(8192);
        container.setMaxBinaryMessageBufferSize(8192);
        return container;
    }

    @Override
    public void registerWebSocketHandlers(@NonNull WebSocketHandlerRegistry registry) {
        registry
            .addHandler(webSocketHandler, centralSystemProperties.getPath())
            .setHandshakeHandler(ocpp16HandshakeHandler)
            .addInterceptors(new HttpSessionHandshakeInterceptor(), ocpp16HandshakeInterceptor)
            .setAllowedOrigins(centralSystemProperties.getAllowedOrigins());
    }
}