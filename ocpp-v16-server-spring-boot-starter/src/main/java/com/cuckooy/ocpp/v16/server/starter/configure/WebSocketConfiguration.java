package com.cuckooy.ocpp.v16.server.starter.configure;

import com.cuckooy.ocpp.v16.server.starter.autoconfigure.CentralSystemProperties;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeHandler;
import com.cuckooy.ocpp.v16.server.websocket.Ocpp16HandshakeInterceptor;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

@EnableWebSocket
@AutoConfiguration
public class WebSocketConfiguration implements WebSocketConfigurer {

    private final CentralSystemProperties centralSystemProperties;
    private final WebSocketHandler webSocketHandler;
    private final Ocpp16HandshakeHandler ocpp16HandshakeHandler;
    private final Ocpp16HandshakeInterceptor ocpp16HandshakeInterceptor;

    public WebSocketConfiguration(CentralSystemProperties centralSystemProperties, WebSocketHandler webSocketHandler,
                                  Ocpp16HandshakeHandler ocpp16HandshakeHandler,
                                  Ocpp16HandshakeInterceptor ocpp16HandshakeInterceptor) {
        this.centralSystemProperties = centralSystemProperties;
        this.webSocketHandler = webSocketHandler;
        this.ocpp16HandshakeHandler = ocpp16HandshakeHandler;
        this.ocpp16HandshakeInterceptor = ocpp16HandshakeInterceptor;
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
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