package com.cuckooy.ocpp.v16.server.netty.example.service;

import com.cuckooy.ocpp.core.message.OcppVersion;
import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.core.service.ChargePointService;
import com.cuckooy.ocpp.v16.model.core.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;

/**
 * Example implementation of ChargePointService for OCPP v1.6.
 * <p>
 * This is a simple demo implementation for testing purposes.
 * In production, you would implement proper business logic for each request type.
 */
@Slf4j
@Service
public class ExampleChargePointService implements ChargePointService {

    @Override
    public Response handle(String identity, Request request) {
        log.info("[{}] Received request: {}", identity, request.getClass().getSimpleName());

        if (request instanceof BootNotificationRequest bootRequest) {
            log.info("[{}] BootNotification: vendor={}, model={}",
                    identity, bootRequest.getChargePointVendor(), bootRequest.getChargePointModel());
            BootNotificationResponse response = new BootNotificationResponse();
            response.setStatus(RegistrationStatus.Accepted);
            response.setCurrentTime(Instant.now());
            response.setInterval(300);
            return response;
        }

        if (request instanceof HeartbeatRequest) {
            log.info("[{}] Heartbeat", identity);
            HeartbeatResponse response = new HeartbeatResponse();
            response.setCurrentTime(Instant.now());
            return response;
        }

        if (request instanceof AuthorizeRequest authRequest) {
            log.info("[{}] Authorize: idTag={}", identity, authRequest.getIdTag());
            AuthorizeResponse response = new AuthorizeResponse();
            IdTagInfo tagInfo = new IdTagInfo();
            tagInfo.setStatus(AuthorizationStatus.Accepted);
            response.setIdTagInfo(tagInfo);
            return response;
        }

        if (request instanceof StatusNotificationRequest statusRequest) {
            log.info("[{}] StatusNotification: connectorId={}, status={}",
                    identity, statusRequest.getConnectorId(), statusRequest.getStatus());
            return new StatusNotificationResponse();
        }

        if (request instanceof StartTransactionRequest startRequest) {
            log.info("[{}] StartTransaction: connectorId={}, idTag={}",
                    identity, startRequest.getConnectorId(), startRequest.getIdTag());
            StartTransactionResponse response = new StartTransactionResponse();
            IdTagInfo tagInfo = new IdTagInfo();
            tagInfo.setStatus(AuthorizationStatus.Accepted);
            response.setIdTagInfo(tagInfo);
            response.setTransactionId(1);
            return response;
        }

        if (request instanceof StopTransactionRequest stopRequest) {
            log.info("[{}] StopTransaction: transactionId={}", identity, stopRequest.getTransactionId());
            return new StopTransactionResponse();
        }

        if (request instanceof MeterValuesRequest meterRequest) {
            log.info("[{}] MeterValues: connectorId={}", identity, meterRequest.getConnectorId());
            return new MeterValuesResponse();
        }

        if (request instanceof DataTransferRequest dataRequest) {
            log.info("[{}] DataTransfer: vendorId={}", identity, dataRequest.getVendorId());
            DataTransferResponse response = new DataTransferResponse();
            response.setStatus(DataTransferStatus.Accepted);
            return response;
        }

        log.warn("[{}] Unhandled request type: {}", identity, request.getClass().getSimpleName());
        return null;
    }

    @Override
    public OcppVersion getVersion() {
        return OcppVersion.V_16;
    }
}
