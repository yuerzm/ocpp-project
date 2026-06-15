package com.cuckooy.ocpp.server.netty.authentication;

public interface AuthenticationEventHandler {

    ChargePointAuthenticateResponse authenticate(ChargePointAuthenticateRequest request);
}
