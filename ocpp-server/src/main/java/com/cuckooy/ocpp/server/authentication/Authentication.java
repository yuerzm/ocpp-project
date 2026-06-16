package com.cuckooy.ocpp.server.authentication;

/**
 * The interface Authentication.
 */
public interface Authentication {

    /**
     * Gets principal.
     *
     * @return the principal
     */
    Object getPrincipal();

    /**
     * Gets credentials.
     *
     * @return the credentials
     */
    Object getCredentials();

    /**
     * Gets details.
     *
     * @return the details
     */
    Object getDetails();

    /**
     * Is authenticated boolean.
     *
     * @return the boolean
     */
    boolean isAuthenticated();

    /**
     * Sets authenticated.
     *
     * @param authenticated the authenticated
     */
    void setAuthenticated(boolean authenticated);
}
