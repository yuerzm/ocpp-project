package com.cuckooy.ocpp.server.authentication;

public interface AuthenticationProvider {

    void authenticate(Authentication authentication);
}
