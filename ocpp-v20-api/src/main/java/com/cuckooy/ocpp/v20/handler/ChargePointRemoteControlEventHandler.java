package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageRequest;
import com.cuckooy.ocpp.v20.model.remote.TriggerMessageResponse;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorRequest;
import com.cuckooy.ocpp.v20.model.remote.UnlockConnectorResponse;

/**
 * The interface Charge point remote control event handler.
 */
public interface ChargePointRemoteControlEventHandler {

    /**
     * Handle request start transaction request start transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the request start transaction response
     */
    RequestStartTransactionResponse handleRequestStartTransaction(String identity,
                                                                  RequestStartTransactionRequest request);

    /**
     * Handle request stop transaction request stop transaction response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the request stop transaction response
     */
    RequestStopTransactionResponse handleRequestStopTransaction(String identity, RequestStopTransactionRequest request);

    /**
     * Handle trigger message trigger message response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the trigger message response
     */
    TriggerMessageResponse handleTriggerMessage(String identity, TriggerMessageRequest request);

    /**
     * Handle unlock connector unlock connector response.
     *
     * @param identity the identity
     * @param request  the request
     * @return the unlock connector response
     */
    UnlockConnectorResponse handleUnlockConnector(String identity, UnlockConnectorRequest request);

}

