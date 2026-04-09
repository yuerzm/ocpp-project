package com.cuckooy.ocpp.v16.handler;

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

/**
 * The interface Charge point core event handler.
 */
public interface ChargePointCoreEventHandler {

    /**
     * Handle change availability change availability response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the change availability response
     */
    ChangeAvailabilityResponse handleChangeAvailability(String identity, ChangeAvailabilityRequest request);

    /**
     * Handle get configuration get configuration response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the get configuration response
     */
    GetConfigurationResponse handleGetConfiguration(String identity, GetConfigurationRequest request);

    /**
     * Handle change configuration change configuration response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the change configuration response
     */
    ChangeConfigurationResponse handleChangeConfiguration(String identity, ChangeConfigurationRequest request);

    /**
     * Handle clear cache clear cache response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the clear cache response
     */
    ClearCacheResponse handleClearCache(String identity, ClearCacheRequest request);

    /**
     * Handle data transfer data transfer response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the data transfer response
     */
    DataTransferResponse handleDataTransfer(String identity, DataTransferRequest request);

    /**
     * Handle remote start transaction remote start transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the remote start transaction response
     */
    RemoteStartTransactionResponse handleRemoteStartTransaction(String identity, RemoteStartTransactionRequest request);

    /**
     * Handle remote stop transaction remote stop transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the remote stop transaction response
     */
    RemoteStopTransactionResponse handleRemoteStopTransaction(String identity, RemoteStopTransactionRequest request);

    /**
     * Handle reset reset response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the reset response
     */
    ResetResponse handleReset(String identity, ResetRequest request);

    /**
     * Handle unlock connector unlock connector response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the unlock connector response
     */
    UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request);
}
