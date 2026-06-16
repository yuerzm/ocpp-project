package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Authentication provider.
 */
public interface AuthenticationProvider {

    /**
     * Authenticate.
     *
     * @param authentication the authentication
     */
    void authenticate(Authentication authentication);
}
