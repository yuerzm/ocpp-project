package com.cuckooy.ocpp.server.handshake;

import com.cuckooy.ocpp.server.provision.ChargePointService;
import com.cuckooy.ocpp.server.provision.SessionAttributeHelper;
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

public class OcppHandshakeInterceptor implements HandshakeInterceptor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final String DEFAULT_PATH = "/websocket/";

    private String path = DEFAULT_PATH;
    private final ChargePointService chargePointService;

    public OcppHandshakeInterceptor(ChargePointService chargePointService) {
        this.chargePointService = chargePointService;
    }

    public OcppHandshakeInterceptor(String path, ChargePointService chargePointService) {
        this.path = path;
        this.chargePointService = chargePointService;
    }

    @Override
    public boolean beforeHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                   @NonNull WebSocketHandler handler, @NonNull Map<String, Object> attributes)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.info("Before Handshake   : {}", request.getURI());
        }

        String identity = parseIdentity(request.getURI().getPath());

        boolean valid = chargePointService.validate(identity);
        if (!valid) {
            logger.error("ChargePoint identity: '{}', violates the configured pattern.", identity);
            response.setStatusCode(HttpStatus.BAD_REQUEST);
            return false;
        }

        boolean exists = chargePointService.checkChargePoint(identity);
        if (!exists) {
            logger.error("ChargePoint identity '{}' is not recognized.", identity);
            response.setStatusCode(HttpStatus.NOT_FOUND);
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
