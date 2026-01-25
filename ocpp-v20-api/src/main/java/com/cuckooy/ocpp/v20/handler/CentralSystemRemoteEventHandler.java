package com.cuckooy.ocpp.v20.handler;

import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStartTransactionResponse;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionRequest;
import com.cuckooy.ocpp.v20.model.remote.RequestStopTransactionResponse;

public interface CentralSystemRemoteEventHandler {

    RequestStartTransactionResponse handleRequestStartTransaction(String sessionId, String identity,
                                                                  RequestStartTransactionRequest request);

    RequestStopTransactionResponse handleRequestStopTransaction(String sessionId, String identity,
                                                                RequestStopTransactionRequest request);

}

