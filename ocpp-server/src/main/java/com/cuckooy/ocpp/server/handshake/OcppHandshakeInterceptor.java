package com.cuckooy.ocpp.server.handshake;

import com.cuckooy.ocpp.server.RegistryEventHandler;
import com.cuckooy.ocpp.server.registry.BasicAuthenticateValidator;
import com.cuckooy.ocpp.server.registry.BasicAuthenticateValidatorImpl;
import com.cuckooy.ocpp.server.registry.ChargePointRegistry;
import com.cuckooy.ocpp.server.session.SessionAttributeHelper;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.Map;
import java.util.Objects;

public class OcppHandshakeInterceptor implements HandshakeInterceptor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final String DEFAULT_PATH = "/websocket/";

    private final String path;
    private final RegistryEventHandler registryEventHandler;
    private final BasicAuthenticateValidator basicAuthenticateValidator;

    public OcppHandshakeInterceptor(RegistryEventHandler registryEventHandler) {
        this.path = DEFAULT_PATH;
        this.registryEventHandler = registryEventHandler;
        this.basicAuthenticateValidator = new BasicAuthenticateValidatorImpl();
    }

    public OcppHandshakeInterceptor(String path, RegistryEventHandler registryEventHandler) {
        this.path = path;
        this.registryEventHandler = registryEventHandler;
        this.basicAuthenticateValidator = new BasicAuthenticateValidatorImpl();
    }

    @Override
    public boolean beforeHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                   @NonNull WebSocketHandler handler, @NonNull Map<String, Object> attributes)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.info("Before Handshake   : {}", request.getURI());
        }

        String identity = parseIdentity(request.getURI().getPath());

        boolean validated = registryEventHandler.validate(identity);
        if (!validated) {
            logger.error("ChargePoint identity: '{}', violates the configured pattern.", identity);
            response.setStatusCode(HttpStatus.BAD_REQUEST);
            return false;
        }

        ChargePointRegistry registry = registryEventHandler.retrieve(identity);

        if (Objects.isNull(registry) || !registry.isRecognized()) {
            logger.error("ChargePoint identity '{}' is not recognized.", identity);
            response.setStatusCode(HttpStatus.NOT_FOUND);
            return false;
        }

        boolean authenticated = basicAuthenticateValidator.authenticate(identity, request, registry);
        if (!authenticated) {
            logger.error("ChargePoint identity '{}' is not authenticated.", identity);
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return false;
        }

        attributes.put(SessionAttributeHelper.CHARGE_POINT_IDENTITY, identity);
        return true;
    }

    @Override
    public void afterHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                               @NonNull WebSocketHandler wsHandler, Exception exception) {
        if (logger.isDebugEnabled()) {
            logger.info("After Handshake    : {}", request.getURI());
        }
    }

    private String parseIdentity(final String input) {
        if (StringUtils.isBlank(input)) {
            return "";
        }
        int index = input.indexOf(this.path);
        if (index == -1) {
            return "";
        } else {
            return input.substring(index + this.path.length());
        }
    }
}
