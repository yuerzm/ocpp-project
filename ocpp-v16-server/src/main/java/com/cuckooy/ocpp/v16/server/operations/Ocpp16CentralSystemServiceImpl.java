package com.cuckooy.ocpp.v16.server.operations;

import com.cuckooy.ocpp.core.message.Request;
import com.cuckooy.ocpp.core.message.Response;
import com.cuckooy.ocpp.v16.handler.CentralSystemCoreEventHandler;
import com.cuckooy.ocpp.v16.handler.CentralSystemFirmwareEventHandler;
import com.cuckooy.ocpp.v16.model.core.*;
import com.cuckooy.ocpp.v16.model.firmware.DiagnosticsStatusNotificationRequest;
import com.cuckooy.ocpp.v16.model.firmware.FirmwareStatusNotificationRequest;
import com.cuckooy.ocpp.v16.operation.Ocpp16CentralSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Ocpp 16 central system service.
 */
public class Ocpp16CentralSystemServiceImpl implements Ocpp16CentralSystemService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final CentralSystemCoreEventHandler coreEventHandler;
    private final CentralSystemFirmwareEventHandler firmwareEventHandler;

    /**
     * Instantiates a new Ocpp 16 central system service.
     *
     * @param coreEventHandler     the core event handler
     * @param firmwareEventHandler the firmware event handler
     */
    public Ocpp16CentralSystemServiceImpl(CentralSystemCoreEventHandler coreEventHandler,
                                          CentralSystemFirmwareEventHandler firmwareEventHandler) {
        this.coreEventHandler = coreEventHandler;
        this.firmwareEventHandler = firmwareEventHandler;
    }

    @Override
    public Response handle(String identity, Request request) {

        if (logger.isDebugEnabled()) {
            logger.info("Handle identity: {}, request: {}", identity, request);
        }

        if (request instanceof AuthorizeRequest req) {
            return coreEventHandler.handleAuthorize(identity, req);
        }

        if (request instanceof BootNotificationRequest req) {
            return coreEventHandler.handleBootNotification(identity, req);
        }

        if (request instanceof DataTransferRequest req) {
            return coreEventHandler.handleDataTransfer(identity, req);
        }

        if (request instanceof HeartbeatRequest req) {
            return coreEventHandler.handleHeartbeat(identity, req);
        }

        if (request instanceof MeterValuesRequest req) {
            return coreEventHandler.handleMeterValues(identity, req);
        }

        if (request instanceof StartTransactionRequest req) {
            return coreEventHandler.handleStartTransaction(identity, req);
        }

        if (request instanceof StatusNotificationRequest req) {
            return coreEventHandler.handleStatusNotification(identity, req);
        }

        if (request instanceof StopTransactionRequest req) {
            return coreEventHandler.handleStopTransaction(identity, req);
        }

        if (request instanceof DiagnosticsStatusNotificationRequest req) {
            return firmwareEventHandler.handleDiagnosticsStatusNotification(identity, req);
        }

        if (request instanceof FirmwareStatusNotificationRequest req) {
            return firmwareEventHandler.handleFirmwareStatusNotification(identity, req);
        }

        throw new UnsupportedOperationException("Unsupported request type: " + request.getClass());
    }
}
