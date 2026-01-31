package com.cuckooy.ocpp.server.registry;

import org.springframework.http.server.ServerHttpRequest;

/**
 * The interface Basic authenticate validator.
 */
public interface BasicAuthenticateValidator {

    /**
     * Authenticate boolean.
     *
     * @param identity      the identity
     * @param request       the request
     * @param authenticated the authenticated
     * @return the boolean
     */
    boolean authenticate(String identity, ServerHttpRequest request, ChargePointRegistry authenticated);

}
