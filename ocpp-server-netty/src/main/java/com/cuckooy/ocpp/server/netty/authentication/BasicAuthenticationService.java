package com.cuckooy.ocpp.server.netty.authentication;

public interface BasicAuthenticationService {

    boolean authenticate(String identity, String authorizationHeader, ChargePointAuthenticateResponse retrieved);
}
