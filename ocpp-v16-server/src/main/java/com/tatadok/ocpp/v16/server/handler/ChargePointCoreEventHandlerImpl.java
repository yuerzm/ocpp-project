package com.tatadok.ocpp.v16.server.handler;

import com.tatadok.ocpp.server.SessionRepository;
import com.tatadok.ocpp.server.provision.AbstractChargePointEventHandler;
import com.tatadok.ocpp.v16.handler.ChargePointCoreEventHandler;
import com.tatadok.ocpp.v16.model.core.ChangeAvailabilityRequest;
import com.tatadok.ocpp.v16.model.core.ChangeAvailabilityResponse;
import com.tatadok.ocpp.v16.model.core.ChangeConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.ChangeConfigurationResponse;
import com.tatadok.ocpp.v16.model.core.ClearCacheRequest;
import com.tatadok.ocpp.v16.model.core.ClearCacheResponse;
import com.tatadok.ocpp.v16.model.core.DataTransferRequest;
import com.tatadok.ocpp.v16.model.core.DataTransferResponse;
import com.tatadok.ocpp.v16.model.core.GetConfigurationRequest;
import com.tatadok.ocpp.v16.model.core.GetConfigurationResponse;
import com.tatadok.ocpp.v16.model.core.RemoteStartTransactionRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStartTransactionResponse;
import com.tatadok.ocpp.v16.model.core.RemoteStopTransactionRequest;
import com.tatadok.ocpp.v16.model.core.RemoteStopTransactionResponse;
import com.tatadok.ocpp.v16.model.core.ResetRequest;
import com.tatadok.ocpp.v16.model.core.ResetResponse;
import com.tatadok.ocpp.v16.model.core.UnlockConnectorRequest;
import com.tatadok.ocpp.v16.model.core.UnlockConnectorResponse;
import com.tatadok.ocpp.v16.server.Ocpp16ServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChargePointCoreEventHandlerImpl extends AbstractChargePointEventHandler implements
    ChargePointCoreEventHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ChargePointCoreEventHandlerImpl(Ocpp16ServerTransport serverTransport, SessionRepository sessionRepository) {
        super(serverTransport, sessionRepository);
    }

    @Override
    public ChangeAvailabilityResponse handleChangeAvailability(String sessionId, String identity,
                                                               ChangeAvailabilityRequest request) {
        return (ChangeAvailabilityResponse) invoke(sessionId, identity, request);
    }

    @Override
    public GetConfigurationResponse handleGetConfiguration(String sessionId, String identity,
                                                           GetConfigurationRequest request) {
        return (GetConfigurationResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ChangeConfigurationResponse handleChangeConfiguration(String sessionId, String identity,
                                                                 ChangeConfigurationRequest request) {
        return (ChangeConfigurationResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ClearCacheResponse handleClearCache(String sessionId, String identity, ClearCacheRequest request) {
        return (ClearCacheResponse) invoke(sessionId, identity, request);
    }

    @Override
    public DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request) {
        return (DataTransferResponse) invoke(sessionId, identity, request);
    }

    @Override
    public RemoteStartTransactionResponse handleRemoteStartTransaction(String sessionId, String identity,
                                                                       RemoteStartTransactionRequest request) {
        return (RemoteStartTransactionResponse) invoke(sessionId, identity, request);
    }

    @Override
    public RemoteStopTransactionResponse handleRemoteStopTransaction(String sessionId, String identity,
                                                                     RemoteStopTransactionRequest request) {
        return (RemoteStopTransactionResponse) invoke(sessionId, identity, request);
    }

    @Override
    public ResetResponse handleReset(String sessionId, String identity, ResetRequest request) {
        return (ResetResponse) invoke(sessionId, identity, request);
    }

    @Override
    public UnlockConnectorResponse handleUnlockConnector(String sessionId, String identity,
                                                         UnlockConnectorRequest request) {
        return (UnlockConnectorResponse) invoke(sessionId, identity, request);
    }
}
