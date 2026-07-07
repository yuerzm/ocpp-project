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
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.server.HandshakeInterceptor;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The type Abstract ocpp handshake interceptor.
 */
public abstract class AbstractOcppHandshakeInterceptor implements HandshakeInterceptor {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final String prefix;
    private final AuthenticationManager authenticateManager;

    /**
     * Instantiates a new Abstract ocpp handshake interceptor.
     *
     * @param prefix              the prefix
     * @param authenticateManager the authenticate manager
     */
    public AbstractOcppHandshakeInterceptor(String prefix, AuthenticationManager authenticateManager) {
        this.prefix = prefix;
        this.authenticateManager = authenticateManager;
    }

    @Override
    public boolean beforeHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                                   @NonNull WebSocketHandler wsHandler, @NonNull Map<String, Object> attributes)
        throws Exception {
        if (logger.isDebugEnabled()) {
            logger.info("Before Handshake   : {}", request.getURI());
        }

        if (!doInternalBeforeHandshake(request, response, wsHandler, attributes)) {
            if (logger.isDebugEnabled()) {
                logger.info("Handshake failed before internal handshake : {}", request.getURI());
            }
            return false;
        }

        String identity = parseIdentity(request.getURI().getPath());

        WebSocketHttpHeaders webSocketHttpHeaders = new WebSocketHttpHeaders(request.getHeaders());
        List<String> protocols = webSocketHttpHeaders.getSecWebSocketProtocol();

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
            attributes.put(SessionAttributeHelper.CHARGE_POINT_PROTOCOL, protocols);
            return true;

        } catch (ChargePointNotFoundException e) {
            missingAuthentication(identity, request, response, e);
            return false;

        } catch (ChargePointBadCredentialException e) {
            unsuccessfulAuthentication(identity, request, response, e);
            return false;
        }
    }

    @Override
    public void afterHandshake(@NonNull ServerHttpRequest request, @NonNull ServerHttpResponse response,
                               @NonNull WebSocketHandler wsHandler, Exception exception) {
        if (logger.isDebugEnabled()) {
            logger.info("After Handshake    : {}", request.getURI());
        }

        doInternalAfterHandshake(request, response, wsHandler, exception);

    }

    /**
     * Do internal before handshake boolean.
     *
     * @param request    the request
     * @param response   the response
     * @param handler    the handler
     * @param attributes the attributes
     * @return the boolean
     * @throws Exception the exception
     */
    protected abstract boolean doInternalBeforeHandshake(@NonNull ServerHttpRequest request,
                                                         @NonNull ServerHttpResponse response,
                                                         @NonNull WebSocketHandler handler,
                                                         @NonNull Map<String, Object> attributes) throws Exception;

    /**
     * Do internal after handshake.
     *
     * @param request   the request
     * @param response  the response
     * @param wsHandler the ws handler
     * @param exception the exception
     */
    protected abstract void doInternalAfterHandshake(@NonNull ServerHttpRequest request,
                                                     @NonNull ServerHttpResponse response,
                                                     @NonNull WebSocketHandler wsHandler, Exception exception);

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


    private String parseIdentity(final String input) {
        if (StringUtils.isBlank(input)) {
            return "";
        }
        int index = input.indexOf(this.prefix);
        if (index == -1) {
            return "";
        } else {
            return input.substring(index + this.prefix.length());
        }
    }
}
