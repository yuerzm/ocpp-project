package com.tatadok.ocpp.v16.handler;

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

public interface ChargePointCoreEventHandler {

    ChangeAvailabilityResponse handleChangeAvailability(String sessionId, String identity,
                                                        ChangeAvailabilityRequest request);

    GetConfigurationResponse handleGetConfiguration(String sessionId, String identity, GetConfigurationRequest request);

    ChangeConfigurationResponse handleChangeConfiguration(String sessionId, String identity,
                                                          ChangeConfigurationRequest request);

    ClearCacheResponse handleClearCache(String sessionId, String identity, ClearCacheRequest request);

    DataTransferResponse handleDataTransfer(String sessionId, String identity, DataTransferRequest request);

    RemoteStartTransactionResponse handleRemoteStartTransaction(String sessionId, String identity,
                                                                RemoteStartTransactionRequest request);

    RemoteStopTransactionResponse handleRemoteStopTransaction(String sessionId, String identity,
                                                              RemoteStopTransactionRequest request);

    ResetResponse handleReset(String sessionId, String identity, ResetRequest request);

    UnlockConnectorResponse handleUnlockConnector(String sessionId, String identity, UnlockConnectorRequest request);
}
