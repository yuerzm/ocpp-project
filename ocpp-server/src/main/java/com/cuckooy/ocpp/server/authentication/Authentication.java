package com.cuckooy.ocpp.server.authentication;

public interface Authentication {

    Object getPrincipal();

    Object getCredentials();

    Object getDetails();

    boolean isAuthenticated();

    void setAuthenticated(boolean authenticated);
}
