package com.cuckooy.ocpp.v16.server.handler;

import com.cuckooy.ocpp.server.handler.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.session.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.cuckooy.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.cuckooy.ocpp.v16.model.core.ChangeAvailabilityResponse;
import com.cuckooy.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.ChangeConfigurationResponse;
import com.cuckooy.ocpp.v16.model.core.ClearCacheRequest;
import com.cuckooy.ocpp.v16.model.core.ClearCacheResponse;
import com.cuckooy.ocpp.v16.model.core.DataTransferRequest;
import com.cuckooy.ocpp.v16.model.core.DataTransferResponse;
import com.cuckooy.ocpp.v16.model.core.GetConfigurationRequest;
import com.cuckooy.ocpp.v16.model.core.GetConfigurationResponse;
import com.cuckooy.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStartTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.cuckooy.ocpp.v16.model.core.RemoteStopTransactionResponse;
import com.cuckooy.ocpp.v16.model.core.ResetRequest;
import com.cuckooy.ocpp.v16.model.core.ResetResponse;
import com.cuckooy.ocpp.v16.model.core.UnlockConnectorRequest;
import com.cuckooy.ocpp.v16.model.core.UnlockConnectorResponse;
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
        return (ChangeAvailabilityResponse) invoke(identity, request);
    }

    @Override
    public GetConfigurationResponse handleGetConfiguration(String identity, GetConfigurationRequest request) {
        return (GetConfigurationResponse) invoke(identity, request);
    }

    @Override
    public ChangeConfigurationResponse handleChangeConfiguration(String identity, ChangeConfigurationRequest request) {
        return (ChangeConfigurationResponse) invoke(identity, request);
    }

    @Override
    public ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request) {
        return (ClearCacheResponse) invoke(identity, request);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request) {
        return (DataTransferResponse) invoke(identity, request);
    }

    @Override
    public RemoteStartTransactionResponse handleRemoteStartTransaction(String identity,
                                                                       RemoteStartTransactionRequest request) {
        return (RemoteStartTransactionResponse) invoke(identity, request);
    }

    @Override
    public RemoteStopTransactionResponse handleRemoteStopTransaction(String identity,
                                                                     RemoteStopTransactionRequest request) {
        return (RemoteStopTransactionResponse) invoke(identity, request);
    }

    @Override
    public ResetResponse handleReset(String identity, ResetRequest request) {
        return (ResetResponse) invoke(identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request) {
        return (UnlockConnectorResponse) invoke(identity, request);
    }
}
