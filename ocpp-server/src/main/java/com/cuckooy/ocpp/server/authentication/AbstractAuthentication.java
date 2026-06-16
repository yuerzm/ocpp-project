package com.cuckooy.ocpp.server.authentication;

import lombok.Getter;

@Getter
public abstract class AbstractAuthentication implements Authentication {

    private Object details;
    private boolean authenticated;

    @Override
    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public void setDetails(Object details) {
        this.details = details;
    }
}
