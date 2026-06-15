package com.cuckooy.ocpp.v16.server.netty.example.service;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.core.service.CentralSystemService;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Example implementation of Ocpp16CentralSystemService for OCPP v1.6.
 * <p>
 * This is a simple demo implementation for testing purposes.
 * In production, you would implement proper business logic for each request type.
 */
@Slf4j
@Service
public class ExampleCentralSystemService implements Ocpp16CentralSystemService {

    @Override
    public Response handle(String identity, Request request) {
        log.info("[CentralSystem] Received request from {}: {}", identity, request.getClass().getSimpleName());

        // Simple demo - just log the request
        // In production, you would dispatch to specific handlers based on request type
        log.warn("Unhandled request type: {}", request.getClass().getSimpleName());
        return null;
    }

    @Override
    public OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
