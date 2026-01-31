package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionResponse;

/**
 * The interface Central system remote event handler.
 */
public interface CentralSystemRemoteEventHandler {

    /**
     * Handle request start transaction request start transaction response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the request start transaction response
     */
    RequestStartTransactionResponse handleRequestStartTransaction(String sessionId, String identity,
                                                                  RequestStartTransactionRequest request);

    /**
     * Handle request stop transaction request stop transaction response.
     *
     * @param sessionId the session id
     * @param identity  the identity
     * @param request   the request
     * @return the request stop transaction response
     */
    RequestStopTransactionResponse handleRequestStopTransaction(String sessionId, String identity,
                                                                RequestStopTransactionRequest request);

}

