package com.cuckooy.ocpp.server.authentication;

public class BasicAuthentication extends AbstractAuthentication {

    private final String identity;
    private final String token;

    private BasicAuthentication(String identity, String token, boolean authenticated) {
        this.identity = identity;
        this.token = token;
        setAuthenticated(authenticated);
    }

    public static BasicAuthentication unauthenticated(String identity, String token) {
        return new BasicAuthentication(identity, token, false);
    }

    public static BasicAuthentication authenticated(String identity, String token) {
        return new BasicAuthentication(identity, token, true);
    }

    @Override
    public Object getPrincipal() {
        return this.identity;
    }

    @Override
    public Object getCredentials() {
        return this.token;
    }
}
