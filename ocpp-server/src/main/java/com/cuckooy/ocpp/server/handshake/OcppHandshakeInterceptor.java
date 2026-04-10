package com.cuckooy.ocpp.server.handshake;

import com.cuckooy.ocpp.server.authentication.AuthenticationEventHandler;
import com.cuckooy.ocpp.server.authentication.BasicAuthenticationService;
import com.cuckooy.ocpp.server.authentication.BasicAuthenticationServiceImpl;
import com.cuckooy.ocpp.server.authentication.ChargePointRetrieveRequest;
import com.cuckooy.ocpp.server.authentication.ChargePointRetrieveResponse;
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
    private final AuthenticationEventHandler authenticationEventHandler;
    private final BasicAuthenticationService basicAuthenticationService;

    /**
     * Instantiates a new Ocpp handshake interceptor.
     *
     * @param authenticationEventHandler the authentication event handler
     */
    public OcppHandshakeInterceptor(AuthenticationEventHandler authenticationEventHandler) {
        this.path = DEFAULT_PATH;
        this.authenticationEventHandler = authenticationEventHandler;
        this.basicAuthenticationService = new BasicAuthenticationServiceImpl();
    }

    /**
     * Instantiates a new Ocpp handshake interceptor.
     *
     * @param path                       the path
     * @param authenticationEventHandler the authentication event handler
     */
    public OcppHandshakeInterceptor(String path, AuthenticationEventHandler authenticationEventHandler) {
        this.path = path;
        this.authenticationEventHandler = authenticationEventHandler;
        this.basicAuthenticationService = new BasicAuthenticationServiceImpl();
    }

    @Override
    public boolean beforeHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                   @NonNull WebSocketHandler handler, @NonNull Map<String, Object> attributes)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.info("Before Handshake   : {}", request.getURI());
        }

        String identity = parseIdentity(request.getURI().getPath());

        ChargePointRetrieveRequest authenticateRequest = new ChargePointRetrieveRequest(identity);
        ChargePointRetrieveResponse authenticateResponse = authenticationEventHandler.retrieve(authenticateRequest);

        if (Objects.isNull(authenticateResponse) || !authenticateResponse.isRecognized()) {
            logger.error("Charge Point identity '{}' is not recognized.", identity);
            response.setStatusCode(HttpStatus.NOT_FOUND);
            return false;
        }

        boolean authenticated = basicAuthenticationService.authenticate(identity, request, authenticateResponse);
        if (!authenticated) {
            logger.error("Charge Point identity '{}' is not authenticated.", identity);
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
