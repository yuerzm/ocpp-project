package com.cuckooy.ocpp.server.authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * The type Basic authentication service.
 */
public class BasicAuthenticationServiceImpl implements BasicAuthenticationService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean authenticate(String identity, ServerHttpRequest request, ChargePointRetrieveResponse retrieved) {

        if (!retrieved.isRequired()) {
            if (logger.isDebugEnabled()) {
                logger.debug("Charge Point {} Authentication is not required.", identity);
            }
            return true;
        }

        if (logger.isDebugEnabled()) {
            logger.debug("Charge Point {} Authentication is required.", identity);
        }

        String authorizationHeader = request.getHeaders().getFirst("Authorization");
        if (authorizationHeader == null || !authorizationHeader.startsWith("Basic ")) {
            if (logger.isDebugEnabled()) {
                logger.debug("Charge Point {} provide illegal authorization header: {}", identity, authorizationHeader);
            }
            return false;
        }

        String plaintext = retrieved.getUsername() + ":" + retrieved.getPassword();

        byte[] decodedBytes = Base64.getEncoder().encode(plaintext.getBytes(StandardCharsets.UTF_8));
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

        String base64Credentials = authorizationHeader.substring(6);

        boolean equals = Objects.equals(base64Credentials, decodedString);

        if (logger.isDebugEnabled()) {
            logger.debug("Charge Point {} authenticate: {}", identity, equals);
        }

        return equals;
    }
}
