package com.cuckooy.ocpp.server.registry;

import org.springframework.http.server.ServerHttpRequest;

public interface BasicAuthenticateValidator {

    boolean authenticate(String identity, ServerHttpRequest request, ChargePointRegistry authenticated);

}
