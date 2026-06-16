package com.cuckooy.ocpp.server.authentication;

import lombok.Getter;

/**
 * The type Abstract authentication.
 */
@Getter
public abstract class AbstractAuthentication implements Authentication {

    private Object details;
    private boolean authenticated;

    @Override
    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(Object details) {
        this.details = details;
    }
}
