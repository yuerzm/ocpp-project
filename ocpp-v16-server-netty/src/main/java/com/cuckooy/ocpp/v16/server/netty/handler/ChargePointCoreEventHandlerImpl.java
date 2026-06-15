package com.cuckooy.ocpp.v16.server.netty.handler;

import com.cuckooy.ocpp.server.netty.AbstractChargePointEventHandler;
import com.cuckooy.ocpp.server.netty.ServerTransport;
import com.cuckooy.ocpp.server.netty.SessionRepository;
import com.cuckooy.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.cuckooy.ocpp.v16.model.core.*;

public class ChargePointCoreEventHandlerImpl extends AbstractChargePointEventHandler implements ChargePointCoreEventHandler {

    public ChargePointCoreEventHandlerImpl(ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ResetResponse handleReset(String identity, ResetRequest request) {
        return (ResetResponse) invoke(identity, request);
    }

    @Override
    public ChangeAvailabilityResponse handleChangeAvailability(String identity, ChangeAvailabilityRequest request) {
        return (ChangeAvailabilityResponse) invoke(identity, request);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request) {
        return (DataTransferResponse) invoke(identity, request);
    }

    @Override
    public ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request) {
        return (ClearCacheResponse) invoke(identity, request);
    }

    @Override
    public ChangeConfigurationResponse handleChangeConfiguration(String identity, ChangeConfigurationRequest request) {
        return (ChangeConfigurationResponse) invoke(identity, request);
    }

    @Override
    public RemoteStartTransactionResponse handleRemoteStartTransaction(String identity, RemoteStartTransactionRequest request) {
        return (RemoteStartTransactionResponse) invoke(identity, request);
    }

    @Override
    public RemoteStopTransactionResponse handleRemoteStopTransaction(String identity, RemoteStopTransactionRequest request) {
        return (RemoteStopTransactionResponse) invoke(identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request) {
        return (UnlockConnectorResponse) invoke(identity, request);
    }

    @Override
    public GetConfigurationResponse handleGetConfiguration(String identity, GetConfigurationRequest request) {
        return (GetConfigurationResponse) invoke(identity, request);
    }
}
