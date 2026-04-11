package com.cuckooy.ocpp.server.authentication;

import org.springframework.http.server.ServerHttpRequest;

/**
 * The interface Basic authentication service.
 */
public interface BasicAuthenticationService {

    /**
     * Authenticate boolean.
     *
     * @param identity  the identity
     * @param request   the request
     * @param retrieved the retrieved
     * @return the boolean
     */
    boolean authenticate(String identity, ServerHttpRequest request, ChargePointAuthenticateResponse retrieved);

}
