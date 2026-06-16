package com.cuckooy.ocpp.server.handshake;

import com.cuckooy.ocpp.server.authentication.Authentication;
import com.cuckooy.ocpp.server.authentication.AuthenticationException;
import com.cuckooy.ocpp.server.authentication.AuthenticationManager;
import com.cuckooy.ocpp.server.authentication.BasicAuthentication;
import com.cuckooy.ocpp.server.authentication.ChargePointBadCredentialException;
import com.cuckooy.ocpp.server.authentication.ChargePointNotFoundException;
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

/**
 * The type Ocpp handshake interceptor.
 */
public class OcppHandshakeInterceptor implements HandshakeInterceptor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private static final String DEFAULT_PATH = "/websocket/";

    private final String path;
    private final AuthenticationManager authenticateManager;

    public OcppHandshakeInterceptor(AuthenticationManager authenticateManager) {
        this.path = DEFAULT_PATH;
        this.authenticateManager = authenticateManager;
    }

    public OcppHandshakeInterceptor(String path, AuthenticationManager authenticateManager) {
        this.path = path;
        this.authenticateManager = authenticateManager;
    }

    @Override
    public boolean beforeHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                   @NonNull WebSocketHandler handler, @NonNull Map<String, Object> attributes)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.info("Before Handshake   : {}", request.getURI());
        }

        String identity = parseIdentity(request.getURI().getPath());

        if (logger.isDebugEnabled()) {
            logger.debug("Charge Point {} Authentication is required.", identity);
        }

        String authorizationHeader = request.getHeaders().getFirst("Authorization");
        authorizationHeader = Objects.nonNull(authorizationHeader) ? authorizationHeader : "";

        Authentication authentication = BasicAuthentication.unauthenticated(identity, authorizationHeader);

        try {
            authenticateManager.authenticate(authentication);
            logger.info("Charge Point identity '{}' authenticated succeed.", identity);

            attributes.put(SessionAttributeHelper.CHARGE_POINT_IDENTITY, identity);
            return true;

        } catch (ChargePointNotFoundException e) {
            missingAuthentication(identity, request, response, e);
            return false;

        } catch (ChargePointBadCredentialException e) {
            unsuccessfulAuthentication(identity, request, response, e);
            return false;
        }
    }

    private void missingAuthentication(String identity, ServerHttpRequest request, ServerHttpResponse response,
                                       AuthenticationException e) {
        logger.error("Charge Point identity '{}' is not recognized.", identity);
        response.setStatusCode(HttpStatus.NOT_FOUND);
    }

    private void unsuccessfulAuthentication(String identity, ServerHttpRequest request, ServerHttpResponse response,
                                            AuthenticationException e) {
        logger.error("Charge Point identity '{}' authenticated failed.", identity);
        response.setStatusCode(HttpStatus.UNAUTHORIZED);
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
