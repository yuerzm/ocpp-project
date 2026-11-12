package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.cuckooy.ocpp.v16.model.core.*;
import com.cuckooy.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Charge point core event handler.
 */
public class ChargePointCoreEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointCoreEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * Instantiates a new Charge point core event handler.
     *
     * @param serverTransport   the server transport
     * @param sessionRepository the session repository
     */
    public ChargePointCoreEventHandlerImpl(Ocpp16ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ChangeAvailabilityResponse handleChangeAvailability(String identity, ChangeAvailabilityRequest request) {
        logger.info("Handle ChangeAvailability, identity: {}, request: {}", identity, request);
        return (ChangeAvailabilityResponse) invoke(identity, request);
    }

    @Override
    public GetConfigurationResponse handleGetConfiguration(String identity, GetConfigurationRequest request) {
        logger.info("Handle GetConfiguration, identity: {}, request: {}", identity, request);
        return (GetConfigurationResponse) invoke(identity, request);
    }

    @Override
    public ChangeConfigurationResponse handleChangeConfiguration(String identity, ChangeConfigurationRequest request) {
        logger.info("Handle ChangeConfiguration, identity: {}, request: {}", identity, request);
        return (ChangeConfigurationResponse) invoke(identity, request);
    }

    @Override
    public ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request) {
        logger.info("Handle ClearCache, identity: {}, request: {}", identity, request);
        return (ClearCacheResponse) invoke(identity, request);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request) {
        logger.info("Handle DataTransfer, identity: {}, request: {}", identity, request);
        return (DataTransferResponse) invoke(identity, request);
    }

    @Override
    public RemoteStartTransactionResponse handleRemoteStartTransaction(String identity,
                                                                       RemoteStartTransactionRequest request) {
        logger.info("Handle RemoteStartTransaction, identity: {}, request: {}", identity, request);
        return (RemoteStartTransactionResponse) invoke(identity, request);
    }

    @Override
    public RemoteStopTransactionResponse handleRemoteStopTransaction(String identity,
                                                                     RemoteStopTransactionRequest request) {
        logger.info("Handle RemoteStopTransaction, identity: {}, request: {}", identity, request);
        return (RemoteStopTransactionResponse) invoke(identity, request);
    }

    @Override
    public ResetResponse handleReset(String identity, ResetRequest request) {
        logger.info("Handle Reset, identity: {}, request: {}", identity, request);
        return (ResetResponse) invoke(identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request) {
        logger.info("Handle UnlockConnector, identity: {}, request: {}", identity, request);
        return (UnlockConnectorResponse) invoke(identity, request);
    }
}
