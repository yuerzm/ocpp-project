package com.cuckooy.ocpp.v16.server.provision;

import com.cuckooy.ocpp.v16.handler.CentralSystemCoreEventHandler;
import com.cuckooy.ocpp.v16.model.core.AuthorizationStatus;
import com.cuckooy.ocpp.v16.model.core.AuthorizeRequest;
import com.cuckooy.ocpp.v16.model.core.AuthorizeResponse;
import com.cuckooy.ocpp.v16.model.core.BootNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.BootNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferResponse;
import com.cuckooy.ocpp.v16.model.core.DataTransferStatus;
import com.cuckooy.ocpp.v16.model.core.HeartbeatRequest;
import com.cuckooy.ocpp.v16.model.core.HeartbeatResponse;
import com.cuckooy.ocpp.v16.model.core.IdTagInfo;
import com.cuckooy.ocpp.v16.model.core.MeterValuesRequest;
import com.cuckooy.ocpp.v16.model.core.MeterValuesResponse;
import com.cuckooy.ocpp.v16.model.core.RegistrationStatus;
import com.cuckooy.ocpp.v16.model.core.StartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StartTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationResponse;
import com.cuckooy.ocpp.v16.model.core.StopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StopTransactionResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DefaultCoreEventHandler implements CentralSystemCoreEventHandler {

    private final Logger logger = LoggerFactory.getLogger(DefaultCoreEventHandler.class);

    @Override
    public AuthorizeResponse handleAuthorize(String identity, AuthorizeRequest request) {
        logger.info("Handle AuthorizeRequest, request: {}", request);
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setParentIdTag(request.getIdTag());
        idTagInfo.setExpiryDate(Instant.now().plus(1, ChronoUnit.DAYS));
        idTagInfo.setStatus(AuthorizationStatus.Accepted);
        AuthorizeResponse response = new AuthorizeResponse();
        response.setIdTagInfo(idTagInfo);
        return response;
    }

    @Override
    public BootNotificationResponse handleBootNotification(String identity, BootNotificationRequest request) {
        logger.info("Handle BootNotificationRequest, request: {}", request);
        BootNotificationResponse response = new BootNotificationResponse();
        response.setStatus(RegistrationStatus.Accepted);
        response.setInterval(60);
        response.setCurrentTime(Instant.now());
        return response;
    }

    @Override
    public DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request) {
        logger.info("Handle DataTransferRequest, request: {}", request);
        DataTransferResponse response = new DataTransferResponse();
        response.setStatus(DataTransferStatus.Accepted);
        response.setData(request.getData());
        return response;
    }

    @Override
    public HeartbeatResponse handleHeartbeat(String identity, HeartbeatRequest request) {
        logger.info("Handle HeartbeatRequest, request: {}", request);
        HeartbeatResponse response = new HeartbeatResponse();
        response.setCurrentTime(Instant.now());
        return response;
    }

    @Override
    public MeterValuesResponse handleMeterValues(String identity, MeterValuesRequest request) {
        logger.info("Handle MeterValuesRequest, request: {}", request);
        return new MeterValuesResponse();
    }

    @Override
    public StatusNotificationResponse handleStatusNotification(String identity, StatusNotificationRequest request) {
        logger.info("Handle StatusNotificationRequest, request: {}", request);
        return new StatusNotificationResponse();
    }

    @Override
    public StartTransactionResponse handleStartTransaction(String identity, StartTransactionRequest request) {
        logger.info("Handle StartTransactionRequest, request: {}", request);
        StartTransactionResponse response = new StartTransactionResponse();
        response.setTransactionId(Integer.valueOf(RandomStringUtils.secureStrong().nextNumeric(8)));
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setParentIdTag(request.getIdTag());
        idTagInfo.setExpiryDate(Instant.now().plus(1, ChronoUnit.DAYS));
        idTagInfo.setStatus(AuthorizationStatus.Accepted);
        response.setIdTagInfo(idTagInfo);
        return response;
    }

    @Override
    public StopTransactionResponse handleStopTransaction(String identity, StopTransactionRequest request) {
        logger.info("Handle StopTransactionRequest, request: {}", request);
        StopTransactionResponse response = new StopTransactionResponse();
        IdTagInfo idTagInfo = new IdTagInfo();
        idTagInfo.setParentIdTag(request.getIdTag());
        idTagInfo.setExpiryDate(Instant.now().plus(1, ChronoUnit.DAYS));
        idTagInfo.setStatus(AuthorizationStatus.Accepted);
        response.setIdTagInfo(idTagInfo);
        return response;
    }
}
