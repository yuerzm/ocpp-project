package com.cuckooy.ocpp.v16.server.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.handler.CentralSystemCoreEventHandler;
import com.cuckooy.ocpp.v16.handler.CentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v16.model.core.AuthorizeRequest;
import com.cuckooy.ocpp.v16.model.core.BootNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.HeartbeatRequest;
import com.cuckooy.ocpp.v16.model.core.MeterValuesRequest;
import com.cuckooy.ocpp.v16.model.core.StartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.StatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.core.StopTransactionRequest;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ocpp16CentralSystemServiceImpl implements Ocpp16CentralSystemService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final CentralSystemCoreEventHandler coreEventHandler;
    private final CentralSystemFirmwareEventHandler firmwareEventHandler;

    public Ocpp16CentralSystemServiceImpl(CentralSystemCoreEventHandler coreEventHandler,
                                          CentralSystemFirmwareEventHandler firmwareEventHandler) {
        this.coreEventHandler = coreEventHandler;
        this.firmwareEventHandler = firmwareEventHandler;
    }

    @Override
    public Response handle(String sessionId, String identity, Request request) {

        if (logger.isDebugEnabled()) {
            logger.info("Handle session: {}, identity: {}, request: {}", sessionId, identity, request);
        }

        if (request instanceof AuthorizeRequest req) {
            return coreEventHandler.handleAuthorize(sessionId, identity, req);

        } else if (request instanceof BootNotificationRequest req) {
            return coreEventHandler.handleBootNotification(sessionId, identity, req);

        } else if (request instanceof DataTransferRequest req) {
            return coreEventHandler.handleDataTransfer(sessionId, identity, req);

        } else if (request instanceof HeartbeatRequest req) {
            return coreEventHandler.handleHeartbeat(sessionId, identity, req);

        } else if (request instanceof MeterValuesRequest req) {
            return coreEventHandler.handleMeterValues(sessionId, identity, req);

        } else if (request instanceof StartTransactionRequest req) {
            return coreEventHandler.handleStartTransaction(sessionId, identity, req);

        } else if (request instanceof StatusNotificationRequest req) {
            return coreEventHandler.handleStatusNotification(sessionId, identity, req);

        } else if (request instanceof StopTransactionRequest req) {
            return coreEventHandler.handleStopTransaction(sessionId, identity, req);

        } else if (request instanceof DiagnosticsStatusNotificationRequest req) {
            return firmwareEventHandler.handleDiagnosticsStatusNotification(sessionId, identity, req);

        } else if (request instanceof FirmwareStatusNotificationRequest req) {
            return firmwareEventHandler.handleFirmwareStatusNotification(sessionId, identity, req);

        } else {
            throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
        }
    }
}
