package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Authentication manager.
 */
public interface AuthenticationManager {

    /**
     * Authenticate.
     *
     * @param authentication the authentication
     */
    void authenticate(Authentication authentication);
}
